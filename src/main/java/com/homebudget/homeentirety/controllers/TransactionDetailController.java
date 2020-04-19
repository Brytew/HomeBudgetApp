package com.homebudget.homeentirety.controllers;

import com.homebudget.homeentirety.models.TransactionDetail;
import com.homebudget.homeentirety.repositories.TransactionDetailRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Data
@RestController
@RequestMapping("/transactions")
public class TransactionDetailController {

    @Autowired
    private TransactionDetailRepository transactionDetailRepository;

    @GetMapping
    public List<TransactionDetail> getList() {
        return transactionDetailRepository.findAll();
    }

    @GetMapping("/sum")
    public List<TransactionDetail> getSummaryId(@RequestParam Long transactionSummaryId) {
        return transactionDetailRepository.findAllBytransactionSummaryId(transactionSummaryId);
    }
}
