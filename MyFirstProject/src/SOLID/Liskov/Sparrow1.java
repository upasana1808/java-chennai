package SOLID.Liskov;

class Sparrow1 extends Bird1 implements FlyingBird {

    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
