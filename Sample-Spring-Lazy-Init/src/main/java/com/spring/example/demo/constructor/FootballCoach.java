package com.spring.example.demo.constructor;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class FootballCoach implements Coach {
    public FootballCoach() {
        System.out.println("In constructor: " + getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice football dribbling for 45 minutes";
    }
}
