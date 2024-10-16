package com.spring.example.demo.constructor;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice fast batting for 30 minutes";
    }
}
