package com.sampleapp.sampleapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage(){
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage(){
        return "about";
    }
    
    
}
