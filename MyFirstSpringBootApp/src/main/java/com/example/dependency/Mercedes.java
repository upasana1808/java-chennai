package com.example.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mercedes implements Car{
    @Autowired
    @Qualifier("V6")
    Engine engine;
    @Override
    public void spec() {
        System.out.println("this is a Sedan with "+engine.getType()+ " Engine");
    }
}
