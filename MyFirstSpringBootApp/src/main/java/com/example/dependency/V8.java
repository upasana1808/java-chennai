package com.example.dependency;

import org.springframework.stereotype.Component;

@Component("V8")
public class V8 implements Engine{
    String type="v8";
    @Override
    public String getType() {
        return  type;
    }
}
