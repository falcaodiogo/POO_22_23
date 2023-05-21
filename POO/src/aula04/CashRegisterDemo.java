package aula04;

import java.util.ArrayList;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int  getQuantity() {
        return quantity;
    }

    public String toString() {
        return String.format("%-10s %15.2f %10d %10.2f", name, price, quantity, getTotalValue());
    }
}


class CashRegister {

    // ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
    static ArrayList<Product> produtos= new ArrayList<Product>();

    public void addProduct(Product product) {
        produtos.add(product);
    }

    public String toString() {
        double soma = 0;
        for (Product p : produtos) {
            soma += (p.getPrice())*p.getQuantity();
        }
        return String.format("Total Value: %.2f", soma);
    }


}

public class CashRegisterDemo {

    public static void main(String[] args) {

        // Cria e adiciona 5 produtos
        CashRegister cr = new CashRegister();
        cr.addProduct(new Product("Book", 9.99, 3));
        cr.addProduct(new Product("Pen", 1.99, 10));
        cr.addProduct(new Product("Headphones", 29.99, 2));
        cr.addProduct(new Product("Notebook", 19.99, 5));
        cr.addProduct(new Product("Phone case", 5.99, 1));
        
        System.out.printf("%-10s %15s %10s %10s\n", "Product", "Price", "Quantity", "Total");
        for (Product p : CashRegister.produtos) {
            System.out.println(p);
        }
        System.out.println(cr);

    }
}