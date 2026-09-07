package com.example;

import com.example.dependency.Mercedes;
import com.example.model.Book;
import com.example.model.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableAutoconfiguration  @ComponentScan("com.example") @Configuration
public class MyFirstSpringBootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyFirstSpringBootAppApplication.class, args);
//        ApplicationContext context=new AnnotationConfigApplicationContext((MyFirstSpringBootAppApplication.class));
//        Book bookBean1=context.getBean("book1",Book.class);
//        Book bookBean2=context.getBean("book2",Book.class);
//        System.out.println(bookBean1.getTitle());
//        System.out.println(bookBean2.getTitle());
//        Car car1=context.getBean(Car.class);
//        Mercedes m1=context.getBean(Mercedes.class);
//        m1.spec();
//
////
////        Book book1=new Book();
////        book1.setTitle("RDPD");
////        System.out.println(book1.getTitle());
////        Mercedes merc=new Mercedes();
////        merc.spec();
    }
    @Bean(name="book1")
    public Book getBook1(){
        Book b1=new Book();
        b1.setTitle("High living");
        return b1;
    }
    @Bean(name="book2")
    public Book getBook2(){
        return new Book();
    }

}
