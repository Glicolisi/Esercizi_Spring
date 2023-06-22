package com.exercise.exercise.controller;

import com.exercise.exercise.service.Meal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MealControllerPrice {
    List<Meal> mealList = Arrays.asList(
            new Meal("Carbonara","Good",8.99),
            new Meal("Bistecca","NotBad",12.56),
            new Meal("Caviale","Delicious",45.8)
    );
    @GetMapping("/meals/price")

    public ResponseEntity<List<Meal>> mealRangePrice(@RequestParam("min") Double min, @RequestParam("max") Double max){

        List<Meal> pricemealList = new ArrayList<>();
        for (Meal meal : mealList){

            if (meal.getPrice()>=min&&meal.getPrice()<=max){
                pricemealList.add(meal);
            }
        }

        return ResponseEntity.ok(pricemealList);

    }
}
