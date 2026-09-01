package SOLID.OpenClose;

public class Main {

    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentProcessor();

        processor.process(new UPI());
        processor.process(new Card());
        processor.process(new Cash());
    }
}