package CleanCode;

public class TooManyJobs {
    public void method()
    {
        String processOrders(List<Order> orders) {

        int largeOrders = 0;
        int smallOrders = 0;
        double total = 0;

        for (Order order : orders) {

            if (order.getTradeValue() > 10000) {
                largeOrders++;
            } else {
                smallOrders++;
            }

            total += order.getTradeValue();
        }

        String result = "";

        result += "Large orders: " + largeOrders + "\n";
        result += "Small orders: " + smallOrders + "\n";
        result += "Total: " + total;

        return result;
    }
    }

}
