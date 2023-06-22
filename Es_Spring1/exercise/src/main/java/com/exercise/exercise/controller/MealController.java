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

        return ResponseEntity.ok(mealList);
    }

    @PutMapping(value="/meal")

    public ResponseEntity<String>putMeal(@RequestBody Meal meal){
        this.mealList.addAll(mealList1);
        this.mealList.add(meal);
        return ResponseEntity.ok("Aggiunto Meal");

    }
    //Ripartire da qui provando Spring
    @PostMapping(value = "/meal/{Mealname}")

    public ResponseEntity<String>postMeal(@RequestParam String Mealname, @RequestBody Meal meal ){

        for(Meal meal1 : mealList){

            if(meal1.getName().contains(Mealname)){

                meal1.setName(meal.getName());
                meal1.setrating(meal.getrating());
                meal1.setPrice(meal.getPrice());

            } else{

                return ResponseEntity.badRequest().body("Meal inesistente");

            }

        }

        return ResponseEntity.ok("Aggiornato Meal");
    }

}


