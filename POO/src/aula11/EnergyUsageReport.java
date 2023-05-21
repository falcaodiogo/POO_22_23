package aula11;

import java.util.*;
import java.io.*;

public class EnergyUsageReport {

    ArrayList<String> values = new ArrayList<>();
    ArrayList<Customer> customers = new ArrayList<>();

    public void load(String file) {
        try {
            Scanner input = new Scanner(new File(file));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] parts = line.split("\\|");
                values.add(parts.toString());        
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não existente!");
        }
    }

    public void addCustomer(Customer newCustomer) {
        if (customers.contains(newCustomer)) {
            System.out.println("Cliente já existe!");
        } else {
            customers.add(newCustomer);
        }
    }

    public void removeCustomer(int i) {
        if (customers.contains(i)) {
            customers.remove(i);
        } else {
            System.out.println("Cliente não existe!");
        }
    }

    public Customer getCustomer(int i) {
        if (customers.contains(i)) {
            return customers.get(i);
        } else {
            System.out.println("Cliente não existe!");
            return null;
        }
    }

    public double calculateTotalUsage(int i) {
        double total = 0;
        if (customers.contains(i)) {
            for (Customer j : customers) {
                if (j.getCustomerId() == i) {
                    for (Double k : j.getMeterReadings()) {
                        total += k;
                    }
                }
            }
            return total;
        } else {
            System.out.println("Cliente não existe!");
            return 0;
        }
    }

    public void generateReport(String string) {
        try {
            PrintWriter output = new PrintWriter(new File(string));
            for (Customer i : customers) {
                output.println(i);
            }
            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não existente!");
        }
    }

}
