package com.homebudget.homeentirety.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.homebudget.homeentirety.repositories.TradeListRepository;
import com.sun.xml.bind.v2.model.core.ID;

import javax.persistence.*;
import java.util.List;

@Entity(name = "expenses")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class MonthlyExpenses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String Objective;
    private int Totally;

//    @OneToMany
    @ManyToMany
    @JoinTable(
            name = "expenses_transactionList",
            joinColumns = {@JoinColumn(name = "expenses")},
            inverseJoinColumns = {@JoinColumn(name = "transactionList")})
    private List<TradeList> tradeList;

    public MonthlyExpenses() {
    }

    public List<TradeList> getTradeList() {
        return tradeList;
    }

    public void setTradeList(List<TradeList> tradeList) {
        this.tradeList = tradeList;
    }

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

    public void setTotally(int totally) {
        Totally = totally;
    }
}

