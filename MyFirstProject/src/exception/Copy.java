package exception;

public class Copy {
    public static void main(String[] args) {
        try {
            int x = 2;
            int y = 10;
            int z = y / x;
            int[] num=new int[5];
            num[5]=0;
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e)
        {
            if(e instanceof ArithmeticException)
            {
                System.out.println("ArithmeticException");
            }
            else if(e instanceof ArrayIndexOutOfBoundsException)
            {
                System.out.println("ArithmeticException");
            }
            else
            {
                System.out.println("general exception");
            }
        }

    }
}
