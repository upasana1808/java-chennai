package SOLID.interfacesegregation;

class SimplePrinter implements Machine {

    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        // Not supported!
    }

    public void fax() {
        // Not supported!
    }
}
