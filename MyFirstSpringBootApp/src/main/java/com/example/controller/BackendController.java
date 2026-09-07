package com.example.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BackendController {
    ArrayList<String> names=new ArrayList<>();

    public BackendController(){
        names.add("Upasana");
        names.add("Ronaldo");
        names.add("Messi");
        names.add("Yamal");
        names.add("Mbappe");
    }
    //@RequestMapping("/hello") //by default GetMapping
    //@RequestMapping(value="/hello", method=RequestMethod.GET)
    @GetMapping("/home")
    public String home()
    {
        return "Hello how are you";
    }
    @RequestMapping("/list")
    public List<String> showList()
    {
        return names;
    }
    @PostMapping("/add")
    public void add()
    {
       names.add("Jude");
    }
    @PutMapping("/update")
    public void update()
    {
        names.add(2,"Haaland");
    }
    @DeleteMapping("/delete")
    public void delete()
    {
        names.remove(2);
    }



}
