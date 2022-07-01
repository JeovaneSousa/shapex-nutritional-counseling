package com.barbosa.nutrex.entity;


import com.barbosa.nutrex.enums.Goal;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double hight;
    private double currentWeight;
    private double imc;

    private double basalMetabolicRate;
    private LocalDate dateOfBirth;
    private String imcDiagnosis;

    @Embedded
    private List<NutritionalPlan> nutritionalPlans;











    public void setNutritionalPlans(List<NutritionalPlan> nutritionalPlans) {
        this.nutritionalPlans = nutritionalPlans;
    }

    public void setBasalMetabolicRate(double basalMetabolicRate) {
        this.basalMetabolicRate = basalMetabolicRate;
    }

    public List<NutritionalPlan> getNutritionalPlans() {
        return nutritionalPlans;
    }

    public double getBasalMetabolicRate() {
        return basalMetabolicRate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(double currentWeight) {
        this.currentWeight = currentWeight;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getImcDiagnosis() {
        return imcDiagnosis;
    }

    public void setImcDiagnosis(String imcDiagnosis) {
        this.imcDiagnosis = imcDiagnosis;
    }

}
