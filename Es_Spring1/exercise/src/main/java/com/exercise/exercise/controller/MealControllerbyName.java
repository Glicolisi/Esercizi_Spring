package com.exercise.exercise.controller;

import com.exercise.exercise.service.Meal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class MealControllerbyName {

    List<Meal> mealList = Arrays.asList(
            new Meal("Carbonara","Good",8.99),
            new Meal("Bistecca","NotBad",12.56),
            new Meal("Caviale","Delicious",45.8)
    );
    @GetMapping(value="/meals/{name}")


    public ResponseEntity<Meal> mealbyname(@PathVariable("name")String name){

       Meal meal = mealList.stream().filter(m->m.getName().equals(name)).findFirst().get();


       return ResponseEntity.ok(meal);

    }
    @GetMapping(value="meals/rating/{rating}")
    public ResponseEntity<Meal> mealbyrating(@PathVariable("rating")String rating){

        Meal meal = mealList.stream().filter(m->m.getrating().contains(rating)).findFirst().get();


        return ResponseEntity.ok(meal);

    }

}
