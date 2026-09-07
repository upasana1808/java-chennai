package com.example.lambda.methodchaining;

public class Sample {
    int x;
    public Sample setX(int a)
    {
        this.x=a;
        return this;
    }
    public Sample incrementX()
    {
        this.x++;
        return this;
    }
    public void display()
    {
        System.out.println(this.x);
    }
}
