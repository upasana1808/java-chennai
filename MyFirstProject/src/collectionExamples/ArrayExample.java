package collectionExamples;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        int[] num=new int[3];
        num[0]=100;num[2]=200;num[3]=300;
        for (int i=0;i<num.length;i++)
            System.out.println(num[i]);
        Scanner scn=new Scanner(System.in);
        int[] num1=new int[3];
        System.out.println("Enter value for num1");
        for (int i=0;i<num1.length;i++)
            num1[i]=scn.nextInt();
        for(int temp:num1)
            System.out.println(temp);

    }
}
