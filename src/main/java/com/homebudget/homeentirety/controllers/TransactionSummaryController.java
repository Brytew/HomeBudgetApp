package com.homebudget.homeentirety.controllers;

import com.homebudget.homeentirety.models.TransactionSummary;
import com.homebudget.homeentirety.repositories.TransactionSummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions-summary")
public class TransactionSummaryController {

    @Autowired
    private TransactionSummaryRepository transactionSummaryRepository;

    @GetMapping
    public List<TransactionSummary> list() {
        return transactionSummaryRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{ID}")
    public TransactionSummary get(@PathVariable Integer ID) {
        return transactionSummaryRepository.getOne(ID);
    }

    @PostMapping
    public TransactionSummary createSummary(@RequestBody final TransactionSummary transactionSummary) {
        return transactionSummaryRepository.saveAndFlush(transactionSummary);
    }

    @RequestMapping(value = "{ID", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer ID) {
        transactionSummaryRepository.deleteById(ID);
    }
}
