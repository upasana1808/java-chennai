package com.example.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestStreams {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(
                101, "ThinkPad E14", "Laptop",
                75000, 10, "Lenovo", 500, true
        ));

        products.add(new Product(
                102, "Galaxy S25", "Smartphone",
                69999, 15, "Samsung", 200, true
        ));

        products.add(new Product(
                103, "AirPods Pro", "Audio",
                24999, 20, "Apple", 150, true
        ));

        products.add(new Product(
                104, "Mechanical Keyboard", "Accessories",
                4500, 25, "Logitech", 100, true
        ));

        products.add(new Product(
                105, "Wireless Mouse", "Accessories",
                1800, 30, "HP", 80, true
        ));

        products.add(new Product(
                106, "Smart Watch", "Wearable",
                12999, 12, "Amazfit", 150, true
        ));

        products.add(new Product(
                107, "27-inch Monitor", "Monitor",
                22000, 8, "Dell", 700, true
        ));

        products.add(new Product(
                108, "Bluetooth Speaker", "Audio",
                5999, 18, "JBL", 200, true
        ));

        products.add(new Product(
                109, "External SSD 1TB", "Storage",
                8999, 14, "Samsung", 100, true
        ));

        products.add(new Product(
                110, "Webcam HD", "Accessories",
                3500, 0, "Logitech", 100, false
        ));

        //find out the names of all products  with delivery charge >100
        List<String> prods=products.stream()
                                   .filter(p->p.getDeliveryCharges()>100)
                                   .filter(p->p.getBrand().equals("Samsung"))
                                   .map(p->p.getProductName())
                                   .collect(Collectors.toList());
        System.out.println(prods);
        Long count=products.stream()
                .filter(p->p.getDeliveryCharges()>100)
                .filter(p->p.getBrand().equals("Samsung"))
                .map(p->p.getProductName())
                .count();
        System.out.println(count);

        Map<Integer,String> prodMap=products.stream()
                .collect(Collectors.toMap(p->p.getProductId(),p->p.getProductName()));
        System.out.println(prodMap);

    }
}
