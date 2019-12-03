package com.homebudget.homeentirety.models;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "transactionList")
public class TradeList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private Date Day;
    private float Amount;
    private int ObjectiveId;
    private int Source;

//    @ManyToOne
//    private List<MonthlyExpenses> monthlyExpenses;

    public TradeList() {
    }

//    public List<MonthlyExpenses> getMonthlyExpenses() {
//        return monthlyExpenses;
//    }
//
//    public void setMonthlyExpenses(List<MonthlyExpenses> monthlyExpenses) {
//        this.monthlyExpenses = monthlyExpenses;
//    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getDay() {
        return Day;
    }

    public void setDay(Date day) {
        Day = day;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float amount) {
        Amount = amount;
    }

    public int getObjectiveId() {
        return ObjectiveId;
    }

    public void setObjectiveId(int objectiveId) {
        ObjectiveId = objectiveId;
    }

    public int getSource() {
        return Source;
    }

    public void setSource(int source) {
        Source = source;
    }
}
