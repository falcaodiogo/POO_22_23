import java.util.ArrayList;

public class Order {

    // id shhloud increment by 1
    private static int id2 = 0;
    private int id;
    private String storeId;
    private String clientId;
    private String orderDateTime;
    private ArrayList<Item> orderItems;
    private boolean expresso;

    public Order(String storeId, String clientId, String orderDateTime, ArrayList<Item> orderItems, boolean expresso) {
        this.storeId = storeId;
        this.clientId = clientId;
        this.orderDateTime = orderDateTime;
        this.orderItems = orderItems;
        this.expresso = expresso;
        this.id=++id2;
    }

    public int getId() {
        return id;
    }

    public String getStoreId() {
        return storeId;
    }

    public String getClientId() {
        return clientId;
    }

    public String getOrderDateTime() {
        return orderDateTime;
    }

    public ArrayList<Item> getOrderItems() {
        return orderItems;
    }

    public boolean isExpresso() {
        return expresso;
    }

    public double orderPrice() {
        double orderPrice = 0;
        for (Item item : orderItems) {
            orderPrice += item.getPrice();
        }
        return orderPrice;
    }

    @Override
    public String toString() {
        return "Order: " + id  + ", " + storeId + ", " + clientId + ", " + orderDateTime;
    }
}
