package com.example;

import com.example.Testing.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    Calculator cal=new Calculator();
    @Test
    public void testFindBig()
    {
        assertEquals(20, cal.findBig(10,20));
    }@Test
    public void testFindBig1()
    {
        assertEquals(20, cal.findBig(10,20));
    }
    @Test
    public void testFindBig2()
    {
        assertEquals(20, cal.findBig(10,20));
    }


}
