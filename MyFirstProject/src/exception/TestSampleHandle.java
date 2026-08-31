package exception;

public class TestSampleHandle {
    public static void main(String[] args)  {
        SampleHandle obj=new SampleHandle();
        obj.methdo1();
        try {
            obj.method2();
        }catch (Exception e)
        {

        }
    }
}
