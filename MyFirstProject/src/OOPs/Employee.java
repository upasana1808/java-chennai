package OOPs;

public class Employee extends Person{
    int empId;
    public Employee(String name,int age,int empid)
    {
        super(name,age);
        this.empId=empid;
        System.out.println("Employee created");
    }
}
