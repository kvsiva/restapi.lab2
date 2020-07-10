package com.sv.restapi.lab2.service;

import com.sv.restapi.lab2.entity.Course;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class courseService {

    private static List<Course> courses = new ArrayList<>();
    private static int idCounter = 0;
    static {
        courses.add(new Course(++idCounter, "Learn Full stack with Spring Boot and Angular"));
        courses.add(new Course(++idCounter, "Learn Full stack with Spring Boot and React"));
        courses.add(new Course(++idCounter, "Master Microservices with Spring Boot and Spring Cloud"));
        courses.add(new Course(++idCounter, "Deploy Spring Boot Microservices to Cloud with Docker and Kubernetes"));
    }

    public List<Course> findAll() {
        return courses;
    }
}
