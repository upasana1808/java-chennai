package SOLID.OpenClose;

class PaymentProcessor {

    void process(PaymentMethod payment) {
        payment.pay();
    }
}
