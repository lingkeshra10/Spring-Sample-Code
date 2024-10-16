package com.spring.example.demo.constructor;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice football dribbling for 45 minutes";
    }
}
