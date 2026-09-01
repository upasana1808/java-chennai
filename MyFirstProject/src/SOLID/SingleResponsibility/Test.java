package SOLID.SingleResponsibility;

public class Test {
    public static void main(String[] args) {

        Student student = new Student("Rahul");

        MarksCalculator calculator = new MarksCalculator();
        StudentRepository repository = new StudentRepository();
        ReportPrinter printer = new ReportPrinter();

        calculator.calculateMarks(student);
        repository.save(student);
        printer.print(student);
    }
}