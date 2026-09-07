package com.example.dependency;

import org.springframework.stereotype.Component;

@Component("V6")
public class V6 implements Engine{
    String type="v6";
    @Override
    public String getType() {
        return  type;
    }
}
