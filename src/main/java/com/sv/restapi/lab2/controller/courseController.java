package com.sv.restapi.lab2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class courseController {

    @RequestMapping("/course/hello")
    public String sayHello(){
        return "Hello";
    }

}
