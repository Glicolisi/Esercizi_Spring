package com.exercise.exercise.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExerciseController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello";
    }
}
