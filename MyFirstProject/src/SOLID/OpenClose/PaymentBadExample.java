package SOLID.OpenClose;

public class PaymentBadExample {

    void pay(String type) {

        if (type.equals("UPI")) {
            System.out.println("Paying using UPI");
        }
        else if (type.equals("CARD")) {
            System.out.println("Paying using Card");
        }
        else if (type.equals("CASH")) {
            System.out.println("Paying using Cash");
        }
    }
}