package OOPs.abstraction;

public class Employee extends Person implements Artist,Player {
    int empId;

    @Override
    public void doSomething() {
        System.out.println("Employee works to make his/her living");
    }

    @Override
    public void doArt() {

    }

    @Override
    public void doPlay() {

    }

    @Override
    public void coach() {

    }
}
