package exception;

public class Sample {
    public static void main(String[] args) {
        try {
            int x = 2;
            int y = 10;
            int z = y / x;
            int[] num=new int[5];
            num[5]=0;

        }catch(ArithmeticException e)
        {
            System.out.println("something went wrong");
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("something went wrong");
        }catch(Exception e)
        {
            System.out.println("God help you");
        }finally {
            System.out.println("I will get executed come what may");
        }

    }
}
