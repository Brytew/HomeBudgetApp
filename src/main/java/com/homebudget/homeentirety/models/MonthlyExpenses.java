package com.homebudget.homeentirety.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "expenses")
public class MonthlyExpenses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String Objective;
    private float Totally;


    public MonthlyExpenses() {
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getObjective() {
        return Objective;
    }

    public void setObjective(String objective) {
        Objective = objective;
    }

    public float getTotally() {
        return Totally;
    }

    public void setTotally(float totally) {
        Totally = totally;
    }
}

