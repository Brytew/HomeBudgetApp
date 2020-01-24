package com.homebudget.homeentirety.controllers;

import com.homebudget.homeentirety.models.Summary;
import com.homebudget.homeentirety.models.TransactionList;
import com.homebudget.homeentirety.repositories.TransactionListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionListController {

    @Autowired
    private TransactionListRepository transactionListRepository;

    @GetMapping
    public List<TransactionList> list() {
        return transactionListRepository.findAll();
    }

    @PostMapping
    public TransactionList createCourse(@RequestBody final TransactionList transactionList) {
        return transactionListRepository.saveAndFlush(transactionList);
    }
}
