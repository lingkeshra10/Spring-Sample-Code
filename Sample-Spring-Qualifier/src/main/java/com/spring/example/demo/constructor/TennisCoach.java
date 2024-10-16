package com.spring.example.demo.constructor;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice tennis service for 15 minutes";
    }
}
