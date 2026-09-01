package SOLID.SingleResponsibility;

class StudentBadExample {

    String name;

    void calculateMarks() {
        System.out.println("Calculating marks...");
    }

    void saveToDatabase() {
        System.out.println("Saving student to database...");
    }

    void printReport() {
        System.out.println("Printing student report...");
    }
}
