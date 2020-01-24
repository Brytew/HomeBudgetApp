package com.homebudget.homeentirety.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Source {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sourceId;
    private String store;
    private float amount;

}
