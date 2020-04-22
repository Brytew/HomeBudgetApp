package com.homebudget.homeentirety.controllers;

import com.homebudget.homeentirety.models.TransactionDetail;
import com.homebudget.homeentirety.repositories.TransactionDetailRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

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
        return transactionDetailRepository.findAllByTransactionSummaryId(transactionSummaryId);
    }

    @GetMapping("/current")
    public List<String> getFullMonthlyExpenses() {

        List<TransactionDetail> listOfMonthyTransactions = transactionDetailRepository.findAll();
        Map<Long, BigDecimal> mapOfTransactionDetails = new TreeMap<>();

        mapOfTransactionDetails.put(1L, BigDecimal.ZERO);
        mapOfTransactionDetails.put(2L, BigDecimal.ZERO);
        mapOfTransactionDetails.put(3L, BigDecimal.ZERO);
        mapOfTransactionDetails.put(4L, BigDecimal.ZERO);
        mapOfTransactionDetails.put(5L, BigDecimal.ZERO);
        mapOfTransactionDetails.put(6L, BigDecimal.ZERO);
        mapOfTransactionDetails.put(7L, BigDecimal.ZERO);
        mapOfTransactionDetails.put(8L, BigDecimal.ZERO);
        mapOfTransactionDetails.put(9L, BigDecimal.ZERO);
        mapOfTransactionDetails.put(10L, BigDecimal.ZERO);
        mapOfTransactionDetails.put(11L, BigDecimal.ZERO);
        mapOfTransactionDetails.put(12L, BigDecimal.ZERO);
        mapOfTransactionDetails.put(13L, BigDecimal.ZERO);
        mapOfTransactionDetails.put(14L, BigDecimal.ZERO);
        mapOfTransactionDetails.put(15L, BigDecimal.ZERO);
        mapOfTransactionDetails.put(16L, BigDecimal.ZERO);


        for (TransactionDetail loopOfTransactionDetails : listOfMonthyTransactions) {
            BigDecimal value = mapOfTransactionDetails.get(loopOfTransactionDetails.getTransactionSummaryId());
            if (value == null) {
                mapOfTransactionDetails.put(loopOfTransactionDetails.getTransactionSummaryId(), loopOfTransactionDetails.getAmount());
            } else {
                mapOfTransactionDetails.put(loopOfTransactionDetails.getTransactionSummaryId(), value.add(loopOfTransactionDetails.getAmount()));
            }
        }


        BigDecimal summedUpExpension = new BigDecimal(0);
        for (Map.Entry<Long, BigDecimal> entry : mapOfTransactionDetails.entrySet()) {
            summedUpExpension = summedUpExpension.add(entry.getValue());
        }

        BigDecimal fullOfMonthlyBudget = new BigDecimal(1340);
        BigDecimal restOfMonthlyBudget = fullOfMonthlyBudget.subtract(summedUpExpension);


        List<String> templateListOfExpenses = new ArrayList<>();
        for (Map.Entry<Long, BigDecimal> entryString : mapOfTransactionDetails.entrySet()) {
            String templateStringToViewExpenses = entryString.toString();
            templateListOfExpenses.add(templateStringToViewExpenses);
        }

        templateListOfExpenses.add("------");
        templateListOfExpenses.add(summedUpExpension.toString());
        String ileZostalo = ("(1340) = " + restOfMonthlyBudget.toString());
        templateListOfExpenses.add(ileZostalo);

        return templateListOfExpenses;
    }
}


