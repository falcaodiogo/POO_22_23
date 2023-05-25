import java.util.ArrayList;

public class OrderManager {

    private ArrayList<Order> orders;

    public OrderManager() {
        this.orders = new ArrayList<Order>();
    }

    void addOrder(Order neworder) {
        if (orders.contains(neworder)) {
            System.out.println("The order in already inserted!");
        } else {
            orders.add(neworder);
            System.out.println("order aded!");
        }
    }

    void removeOrder(int id) {
        for (Order x : orders) {
            if (x.getId() == id) {
                orders.remove(x);
                System.out.println("order removed!");
                return;
            }
        }
        System.out.println("Order not found!");
    }

    Order searchOrder(int id) {
        for (Order i : orders) {
            if (i.getId() == id) {
                if (orders.contains(i)) {
                    return i;
                }

             }
        }
        return null;
    }

    double calculateOrderCost(int id) {
        StandartOrderCostCalculator calculator = new StandartOrderCostCalculator();
        for (Order i : orders) {
            if (i.getId() == id) {
                return calculator.calculateOrderCost(i);
             }
        }
        return -1;
    }

    void printAllOrder() {
        for (Order s : orders) {
            System.out.println("\n" + s.getId()  + " " + s  + " with cost of " + s.orderPrice());
            for (Item i : s.getOrderItems()) {
                System.out.println(i);
            }
        }
    }
    
}
