package exception;

public class OnlineHiring {
    public static void main(String[] args) {
        Recruitement obj=new Recruitement();
        try {
            obj.checkAge(12);
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e);
        }
    }
}
