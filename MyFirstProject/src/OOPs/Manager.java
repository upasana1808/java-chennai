package OOPs;

public class Manager extends Employee{
    String team;
    public Manager(String name,int age,int empid,String team)
    {
        super(name, age,empid);
        this.team=team;
        System.out.println("Manager created");
    }
}
