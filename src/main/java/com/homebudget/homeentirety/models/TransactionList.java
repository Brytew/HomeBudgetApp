package com.homebudget.homeentirety.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

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
    @CreationTimestamp
    private Date day;
    private float amount;
    private int summaryId;
    private int sourceId;

//    @ManyToOne
//    @ManyToMany //(mappedBy = "transactionList")
//    private List<Summary> summary;
//
//    public TransactionList() {
//    }
//
//    public List<Summary> getSummary() {
//        return summary;
//    }


}
