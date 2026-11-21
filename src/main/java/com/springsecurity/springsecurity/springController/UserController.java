package com.springsecurity.springsecurity.springController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/")
    public String getHomePage(){
        return "Welcome to Danu Page";
    }


}
