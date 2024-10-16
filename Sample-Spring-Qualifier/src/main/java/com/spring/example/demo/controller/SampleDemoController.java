package com.spring.example.demo.controller;

import com.spring.example.demo.constructor.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleDemoController {

    //Define Private Field for the dependency
    private Coach myCoach;

    //Define a constructor for dependency injection
    @Autowired
    public SampleDemoController(@Qualifier("footballCoach") Coach theCoach) {
        this.myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
