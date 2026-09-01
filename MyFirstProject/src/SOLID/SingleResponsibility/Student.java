package SOLID.SingleResponsibility;

public class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

class MarksCalculator {

    void calculateMarks(Student student) {
        System.out.println("Calculating marks for " + student.name);
    }
}

class StudentRepository {

    void save(Student student) {
        System.out.println("Saving " + student.name + " to database");
    }
}

class ReportPrinter {

    void print(Student student) {
        System.out.println("Printing report for " + student.name);
    }
}
