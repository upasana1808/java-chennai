package OOPs.encapsulation;
//bundle the code with data
public class Person {
    //date
    String name; //default
    private int age;
    public String surname;
    protected int salary;

    //code


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0 || age>=115)
            System.out.println("invalid age");
        else
            this.age=age;
    }
}
