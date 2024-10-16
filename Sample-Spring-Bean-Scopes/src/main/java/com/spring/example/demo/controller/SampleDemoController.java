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
    private Coach anotherCoach;

    //Define a constructor for dependency injection
    @Autowired
    public SampleDemoController(@Qualifier("tennisCoach") Coach myCoach, @Qualifier("tennisCoach") Coach anotherCoach) {
        this.myCoach = myCoach;
        this.anotherCoach = anotherCoach;
        System .out.println("In Constructor: " + getClass().getSimpleName());
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }
}
