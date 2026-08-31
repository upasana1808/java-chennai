package OOPs.poly;

public class Test {
    public static void main(String[] args) {
        Liquid l1=new Liquid();
        Tea t=new Tea();
        Milk m=new Milk();
        Mug mg=new Mug();
        Juice j=new Juice();
        mg.addLiquid(l1);
        mg.addLiquid(m);
        mg.addLiquid(t);
        mg.addLiquid(j);
    }
}
