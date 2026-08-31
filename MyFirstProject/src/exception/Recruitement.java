package exception;

public class Recruitement {
    public void checkAge(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("We dont support child labour");
        else
            System.out.println("You are hired");
    }

}
