//import java.io.File; // TODO: não implementei a 100% a escrita do terminal num ficheiro
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderTester {

    public static void main(String[] args) throws FileNotFoundException {
        
        //new OrderManager
        OrderManager orderManager = new OrderManager();

        //new items
        ArrayList<Item> items = new ArrayList<>();
        Item i1 = new Item("Item1", 10.3);
        Item i2 = new Item("Item2", 14.9);
        Item i3 = new Item("Item3", 0.90);
        Item i4 = new Item("Item4", 87.0);
        items.add(i1);
        items.add(i2);
        items.add(i3);
        items.add(i4);

        // make orders
        Order order1 = new Order("STOREOX9", "CLIENT56", "2023-05-25", items, false);
        // same order but with Express option
        Order order2 = new Order("STOREOX9", "CLIENT56", "2023-05-25", items, true);

        // teste orderManager
        orderManager.addOrder(order1);
        orderManager.addOrder(order2);
        orderManager.removeOrder(1); // should remove order
        orderManager.removeOrder(15); // should not work
        System.out.println(orderManager.calculateOrderCost(2));

        // print all order
        orderManager.printAllOrder();

        // readfile
        readfile(System.out);
    }

    private static void readfile(PrintStream out) throws FileNotFoundException {
        Scanner file = new Scanner(new FileReader("pedidos.txt"));

        Order o;
        Item i;

        file.nextLine(); // skip first line

        while (file.hasNext()) {

            OrderManager orderManager2 = new OrderManager();

            String line = file.nextLine();
            String[] parts = line.split(";");
            String[] items = parts[2].split("\\|");

            ArrayList<Item> itemsList = new ArrayList<>();
            for (String item : items) {
                String[] itemParts = item.split(":");
                i = new Item(itemParts[0], Double.parseDouble(itemParts[1]));
                itemsList.add(i);
            }

            o = new Order(parts[0], parts[1], parts[3], itemsList, parts[4].equals("expresso"));
            orderManager2.addOrder(o);

            // print all order
            orderManager2.printAllOrder();

            // printFile(); // TODO: não implementei a 100% a escrita do terminal num ficheiro
        }
        
            
    }

    // private static void printFile() throws FileNotFoundException { // TODO: não implementei a 100% a escrita do terminal num ficheiro
    //     PrintStream fl = new PrintStream(new File("AP2.txt"));
    //     readfile(System.out);
    //     readfile(fl);
    //     fl.close();
    // }
    
}
