package com.exercise.exercise.controller;

import com.exercise.exercise.service.Meal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MealController {

    List<Meal> mealList = new ArrayList<>();

    List<Meal> mealList1 = Arrays.asList(
            new Meal("Carbonara","Good",8.99),
            new Meal("Bistecca","NotBad",12.56),
            new Meal("Caviale","Delicious",45.8)
    );

    @GetMapping(value = "/meals")

    public ResponseEntity<List<Meal>> getMeallist() {

        return ResponseEntity.ok(mealList1);
    }

    @PutMapping(value="/meal")

    public ResponseEntity<String>putMeal(@RequestBody Meal meal){

        this.mealList.add(meal);
        return ResponseEntity.ok("Aggiunto Meal");

    }


}


