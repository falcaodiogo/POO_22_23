public class StandartOrderCostCalculator implements OrderCostCalculator {

    @Override
    public double calculateOrderCost(Order order) {
        double sum = 0;
        for (Item s : order.getOrderItems()) {
            sum += s.getPrice();
        }
        if (order.isExpresso() == true) {
            return sum + sum*0.3;
        }
        return sum;
    }
    
}
