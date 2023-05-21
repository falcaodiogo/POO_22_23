package aula10.Ex2;

import java.util.Scanner;

import utils.Input;

// já implementado com ArrayList

public class Ex2 {

    public static void main(String[] args) {

        // programa menu para criar livros, listar livros e remover livros

        String menu = "1 - Criar livro\n2 - Listar livros\n3 - Remover livro\n5- Listar livros por genero\n6- Listar generos\n7- Listar livros\n8- Listar livro aleatório\n4 - Sair\n";
        Scanner sc = new Scanner(System.in);
        Book b = new Book("u", "u", 0, Genero.DRAMA); // para inicializar o arraylist (static
        BookLibrary bl = new BookLibrary();
        int opcao = 0;

        do {
            System.out.println(menu);
            opcao = Input.inputInt("", sc);

            switch (opcao) {

                case 1:
                    System.out.println("A criar livro...");
                    String titulo = Input.inputString("Titulo: ", sc);
                    String autor = Input.inputString("Autor: ", sc);
                    int ano = Input.inputInt("Ano: ", sc);
                    System.out.println("Escolha o genero:");
                    for (int i = 0; i < Genero.values().length; i++) {
                        System.out.println(i + " - " + Genero.values()[i]);
                    }
                    int generoInt = Input.inputInt("", sc);
                    switch (generoInt) {
                        case 0:
                            b = new Book(titulo, autor, ano, Genero.DRAMA);
                            bl.addBook(b);
                            break;
                        case 1:
                            b = new Book(titulo, autor, ano, Genero.COMEDIA);
                            bl.addBook(b);
                            break;
                        case 2:
                            b = new Book(titulo, autor, ano, Genero.ACAO);
                            bl.addBook(b);
                            break;
                        case 3:
                            b = new Book(titulo, autor, ano, Genero.TERROR);
                            bl.addBook(b);
                            break;
                        case 4:
                            b = new Book(titulo, autor, ano, Genero.AVENTURA);
                            bl.addBook(b);
                            break;
                        default:
                            System.out.println("Opcao invalida!");
                    }
                    break;

                case 2:
                    System.out.println("A listar livros...");
                    for (int i = 0; i < bl.getBooks().size(); i++) {
                        System.out.println(bl.getBooks().get(i));
                    }
                    break;

                case 3:
                    System.out.println("A remover livro...");
                    String tituloRemover = Input.inputString("Titulo: ", sc);
                    bl.removeBook(tituloRemover);
                    break;

                case 4:
                    System.out.println("A sair");
                    break;

                case 5:
                    //listar os livros por pares genero-livro (ex: drama - livro1, livro2, livro3)
                    for (int i = 0; i < Genero.values().length; i++) {
                        System.out.println(Genero.values()[i]);
                        for (int j = 0; j < bl.getBooks().size(); j++) {
                            if (bl.getBooks().get(j).getGenre().equals(Genero.values()[i])) {
                                System.out.println("************");
                                System.out.println(bl.getBooks().get(j).getTitle());
                            }
                        }
                    }
                    break;

                case 6:
                    // listar generos
                    for (int i = 0; i < Genero.values().length; i++) {
                        System.out.println("************");
                        System.out.println(Genero.values()[i]);
                    }
                    break;

                case 7:
                    // listar apenas os livros
                    for (int i = 0; i < bl.getBooks().size(); i++) {
                        System.out.println(bl.getBooks().get(i).getTitle());
                    }
                    break;

                case 8:
                    // random book given a genre
                    System.out.println("Escolha o genero:");
                    for (int i = 0; i < Genero.values().length; i++) {
                        System.out.println(i + " - " + Genero.values()[i]);
                    }
                    int generoInt2 = Input.inputInt("", sc);
                    
                    // random book of generoInt2
                    for (int i = 0; i < bl.getBooks().size(); i++) {
                        if (bl.getBooks().get(i).getGenre().equals(Genero.values()[generoInt2])) {
                            System.out.println("************");
                            System.out.println(bl.getBooks().get(i).getTitle());
                        }
                    }
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }

        } while (opcao != 4);
        
    }
    
}
