package com.example;

import com.example.lambda.Greeting;
import com.example.lambda.Washable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Greeting g=new Greeting(){
            @Override
            public void greet() {
                System.out.println("hello");
            }
            public void greetWithname(){}
        };
        Greeting g1=()->{ System.out.println("hello");};
        g1.greet();
        Washable ww=()->{
            System.out.println("I am washing my clothes");
        };

        //anonymous class


    }
}