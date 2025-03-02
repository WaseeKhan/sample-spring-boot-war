package com.sampleapp.sampleapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users")
    public List getUsers(){
        return List.of(
            "Waseem", "Ram", "Shayam", "Sita", "Gita"
            );
    }
    
}
