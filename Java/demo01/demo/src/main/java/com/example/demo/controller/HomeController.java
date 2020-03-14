package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * HomeController
 */
@RestController
public class HomeController {

    @RequestMapping("/test")
    public String Index(){
        return "Hello,wrold";
    }
    
}