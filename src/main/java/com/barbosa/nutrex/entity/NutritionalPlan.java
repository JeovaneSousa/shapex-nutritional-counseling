package com.barbosa.nutrex.entity;

import com.barbosa.nutrex.enums.Goal;

import javax.persistence.Embeddable;
import java.time.LocalDate;

@Embeddable
public class NutritionalPlan {
    private Goal goal;
    private int daysToAchieve;
    private int weightGoal;
    private LocalDate accountCreationDate;
    private LocalDate planCreationDate;
    private double waterRecommendation;
    private double meanCalorieIntakeRecommendationForGoal;
}
