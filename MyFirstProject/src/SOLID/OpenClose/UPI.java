package SOLID.OpenClose;

class UPI implements PaymentMethod {

    public void pay() {
        System.out.println("Paying using UPI");
    }
}

class Card implements PaymentMethod {

    public void pay() {
        System.out.println("Paying using Card");
    }
}

class Cash implements PaymentMethod {

    public void pay() {
        System.out.println("Paying using Cash");
    }
}