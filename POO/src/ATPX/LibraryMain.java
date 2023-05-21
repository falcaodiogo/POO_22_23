package ATPX;

import java.util.ArrayList;
import java.util.Scanner;

import utils.Input;

public class LibraryMain {
    public static void main(String[] args) {
        ILibrary library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        ArrayList<String> users = new ArrayList<String>();

        do {
            System.out.println("Library Menu:");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Search for item");
            System.out.println("4. Borrow item");
            System.out.println("5. Return item");
            System.out.println("6. Print inventory");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // adicionar um item
                    System.out.println("\nA adicionar item...");
                    String title = Input.inputString("Title: ", scanner);
                    int id = Input.inputInt("Id: ", scanner);
                    boolean availability = true;
                    String userName = Input.inputString("Username: ", scanner);
                    LibraryItem item = new LibraryItem(title, id, availability, userName);
                    library.addItem(item);
                    System.out.println("Item adicionado!\n");
                    break;
                case 2:
                    // remover um item
                    System.out.println("\nA remover item...");
                    String title2 = Input.inputString("Title: ", scanner);
                    if (library.searchForItem(title2) == null) 
                        System.out.println("Item não encontrado");
                    else
                        library.removeItem(library.searchForItem(title2));
                        System.out.println("Item removido\n");
                    break;
                case 3:
                    // procurar um item e imprimir as suas informações
                    System.out.println("\nA procurar item...");
                    String title3 = Input.inputString("Title: ", scanner);
                    library.searchForItem(title3);
                    break;                    
                case 4:
                    // emprestar um item, através do ID
                    int id2 = Input.inputInt("Id: ", scanner);
                    library.borrowItem(id2);
                    break;
                case 5:
                    // devolver um item, através do ID
                    int id3 = Input.inputInt("Id: ", scanner);
                    library.returnItem(id3);
                    break;
                case 6:
                    // imprimir o inventório da libraria
                    library.printInventory();
                    break;
                case 7:
                    System.out.println("\nExiting program.");
                    System.exit(0);
                    break;
                default:
                    // imprimir mensagem de erro
                    System.out.println("\nOpção incorreta!");
                    break;
            }
        } while (choice != 7);
        scanner.close();
    }
}
