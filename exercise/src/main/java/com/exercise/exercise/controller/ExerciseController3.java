package com.exercise.exercise.controller;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ExerciseController3 {

    @GetMapping(value = "/random")
    public ResponseEntity<String> random() {
        Random random = new Random();

        if (random.nextBoolean()) {

                return ResponseEntity.badRequest().body("Bad");
        }

        return ResponseEntity.ok("Good");
    }
}






