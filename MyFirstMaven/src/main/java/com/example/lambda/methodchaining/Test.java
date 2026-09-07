package com.example.lambda.methodchaining;

public class Test {
    public static void main(String[] args) {
        Sample obj=new Sample();
        obj.setX(10);
        obj.incrementX();
        obj.display();
        new Sample().setX(10).incrementX().display();
    }
}
