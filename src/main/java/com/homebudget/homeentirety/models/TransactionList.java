package com.homebudget.homeentirety.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TransactionList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int listId;
    private Date day;
    private float amount;
    private int summaryId;
    private int sourceId;

    @ManyToOne
    @ManyToMany //(mappedBy = "transactionList")
    private List<Object> summary;

    public TransactionList() {
    }

    public List<Object> getSummary() {
        return summary;
    }

    public void setSummary(List<Object> summary) {
        this.summary = summary;
    }


}
