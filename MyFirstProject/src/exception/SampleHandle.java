package exception;

public class SampleHandle {
    public void methdo1()
    {
        try {
            int x = 2;
            int y = 10;
            int z = y / x;
            int[] num=new int[5];
            num[5]=0;

        }catch(ArithmeticException e)
        {
            System.out.println("something went wrong");
        }
    }
    public void method2() throws Exception
    {
            int x = 2;
            int y = 10;
            int z = y / x;
            int[] num=new int[5];
            num[5]=0;

    }
}
