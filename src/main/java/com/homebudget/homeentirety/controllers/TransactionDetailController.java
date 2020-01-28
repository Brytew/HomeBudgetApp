package com.homebudget.homeentirety.controllers;

import com.homebudget.homeentirety.models.TransactionDetail;
import com.homebudget.homeentirety.repositories.TransactionDetailRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@RestController
@RequestMapping("/transactions")
public class TransactionDetailController {

    @Autowired
    private TransactionDetailRepository transactionDetailRepository;

    @PostConstruct
    public void initialize() {
        List<TransactionDetail> courses = new ArrayList<>();
        courses.add(new TransactionDetail(null, 1L, new BigDecimal("34.99"), null));
        courses.add(new TransactionDetail(null, 3L, new BigDecimal("25.59"), null));
        courses.add(new TransactionDetail(null, 3L, new BigDecimal("12.20"), null));

        transactionDetailRepository.saveAll(courses);
    }


    @GetMapping
    public List<TransactionDetail> getList() {
        return transactionDetailRepository.findAll();
    }

    @GetMapping ("/sum")
    public List<TransactionDetail> getSumaryId(@RequestParam Long transactionSummaryId) {
        return transactionDetailRepository.findAllBytransactionSummaryId(transactionSummaryId);
    }

    @PostMapping
    public TransactionDetail createTransaction(@RequestBody final TransactionDetail transactionDetail) {
        return transactionDetailRepository.saveAndFlush(transactionDetail);
    }
}
