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

//    @PostConstruct
//    public void initialize() {
//        List<TransactionDetail> courses = new ArrayList<>();
//        courses.add(new TransactionDetail(null, 1L, new BigDecimal("84.99"), null));
//        courses.add(new TransactionDetail(null, 2L, new BigDecimal("13.59"), null));
//        courses.add(new TransactionDetail(null, 4L, new BigDecimal("47.70"), null));
//        transactionDetailRepository.saveAll(courses);
//    }

    @GetMapping
    public List<TransactionDetail> getList() {
        return transactionDetailRepository.findAll();
    }

    @GetMapping("/sum")
    public List<TransactionDetail> getSummaryId(@RequestParam Long transactionSummaryId) {
        return transactionDetailRepository.findAllBytransactionSummaryId(transactionSummaryId);
    }
}
