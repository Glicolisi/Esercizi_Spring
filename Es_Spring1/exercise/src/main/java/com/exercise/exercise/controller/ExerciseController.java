package com.exercise.exercise.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExerciseController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello";
    }

    @GetMapping(value = "/greeting")
    public ResponseEntity<String> sayGreetings(){

        return ResponseEntity.ok("Good Afternoon!");

    }
}
