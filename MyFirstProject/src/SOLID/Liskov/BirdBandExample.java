package SOLID.Liskov;

class Bird {

    void fly() {
        System.out.println("Bird is flying");
    }
}

class Sparrow extends Bird {

    // Sparrow can fly
}

class Penguin extends Bird {

    void fly() {
        throw new UnsupportedOperationException(
                "Penguin cannot fly"
        );
    }
}
