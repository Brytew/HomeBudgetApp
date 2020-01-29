package com.homebudget.homeentirety.controllers;

import com.homebudget.homeentirety.models.TransactionDetail;
import com.homebudget.homeentirety.repositories.TransactionDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/check")
public class TransactionSummaryCurrentMonthController {

    @Autowired
    private TransactionDetailRepository transactionDetailRepository;


    @GetMapping
    public List<TransactionDetail> getCurrentMonthExpenses(){
        return transactionDetailRepository.getCurrentMonthExpensesQuery();
    }
}
