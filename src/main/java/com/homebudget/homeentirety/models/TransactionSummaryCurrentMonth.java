package com.homebudget.homeentirety.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TransactionSummaryCurrentMonth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @CreationTimestamp
    private Instant checkedAt;
    // Nazwy własne kolumn
    private BigDecimal jedzenieMusze;
    private BigDecimal jedzenieNie;
    private BigDecimal jedzenieNaMiescie;
    private BigDecimal kolumnaG;
    private BigDecimal superfoods;
    private BigDecimal transport;
    private BigDecimal wyjsciaNaWeekend;
    private BigDecimal kolumnaD;
    private BigDecimal ubrania;
    private BigDecimal carr;
    private BigDecimal inwestycje;
    private BigDecimal gory;
    private BigDecimal zdrowie;
    private BigDecimal inne;
    private BigDecimal zwrotyChemia;
    private BigDecimal zycie;

}
