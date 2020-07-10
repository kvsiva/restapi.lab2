package com.sv.restapi.lab2.controller;

import com.sv.restapi.lab2.entity.Course;
import com.sv.restapi.lab2.service.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class courseController {

    @RequestMapping("/course/hello")
    public String sayHello(){
        return "Hello";
    }
    @Autowired
    private courseService courseService;
    @GetMapping("/courses")
    private List<Course> getAllCourses(){
        return courseService.findAll();

    }
}
