package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // web controller which renders the page
public class MainController {
    @RequestMapping("/home")
    public String home()
    {
        return "index.html";
    }
    @RequestMapping("/about")
    public String aboutus()
    {
        return "aboutus.html";
    }


}
