package com.homebudget.homeentirety.models;

import com.sun.xml.bind.v2.model.core.ID;

import javax.persistence.*;
import java.util.List;

@Entity(name = "expenses")
public class MonthlyExpenses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String Objective;
    private float Totally;

//    @OneToMany(mappedBy = "expenses")
//    @JoinTable(
//            name = "expenses",
//            joinColumns = {@JoinColumn(name = "Totally")},
//            inverseJoinColumns = {@JoinColumn(name = "ObjectiveId")})
//    private List<TradeListRepository> tradeList;

    public MonthlyExpenses() {
    }

//    public List<TradeListRepository> getTradeList() {
//        return tradeList;
//    }
//
//    public void setTradeList(List<TradeListRepository> tradeList) {
//        this.tradeList = tradeList;
//    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
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

