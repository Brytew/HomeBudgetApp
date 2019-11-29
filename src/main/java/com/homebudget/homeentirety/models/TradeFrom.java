package com.homebudget.homeentirety.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "source")
public class TradeFrom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String Banks;
    private float Rest;

    public TradeFrom() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBanks() {
        return Banks;
    }

    public void setBanks(String banks) {
        Banks = banks;
    }

    public float getRest() {
        return Rest;
    }

    public void setRest(float rest) {
        Rest = rest;
    }
}
