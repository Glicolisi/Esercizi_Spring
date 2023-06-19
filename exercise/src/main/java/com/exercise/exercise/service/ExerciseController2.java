package com.exercise.exercise.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExerciseController2 {
    @GetMapping(value = "/info")
    public ResponseEntity<String> checkStatus(){

        return ResponseEntity.ok("ok");

    }



}
