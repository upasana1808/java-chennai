package CleanCode;

public class DontKnow {
    public void process(List<Order> x) {

        int a = 0;
        int b = 0;

        for (Order o : x) {

            if (o.getAmount() > 10000) {
                a++;
            } else {
                b++;
            }
        }

        System.out.println(a);
        System.out.println(b);
    }
}
