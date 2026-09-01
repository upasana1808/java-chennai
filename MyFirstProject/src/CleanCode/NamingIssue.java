package CleanCode;

public class NamingIssue {
    String s(List<Order> o) {

        int n1 = 0;
        int n2 = 0;
        double x = 0;

        for (Order od : o) {
        ...
        }

        return s;
    }
}
////////////////////
String generateOrderReport(List<Order> orders) {

    int largeOrderCount = 0;
    int smallOrderCount = 0;
    double totalValue = 0;

    for (Order order : orders) {

        if (order.getTradeValue() > LARGE_ORDER_THRESHOLD) {
            largeOrderCount++;
        } else {
            smallOrderCount++;
        }

        totalValue += order.getTradeValue();
    }

    return createReport(
            largeOrderCount,
            smallOrderCount,
            totalValue
    );
}