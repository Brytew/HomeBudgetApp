package com.homebudget.homeentirety.controllers;

import com.homebudget.homeentirety.models.TransactionDetail;
import com.homebudget.homeentirety.repositories.TransactionDetailRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
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
    public String getFullMonthlyExpenses() {

        List<TransactionDetail> listOfMonthyTransactions = transactionDetailRepository.findAll();
        Map<Long, BigDecimal> mapOfTransactionDetails = new HashMap<>();

        for (TransactionDetail loopOfTransactionDetails : listOfMonthyTransactions) {
            BigDecimal value = mapOfTransactionDetails.get(loopOfTransactionDetails.getTransactionSummaryId());
            if (value == null) {
                mapOfTransactionDetails.put(loopOfTransactionDetails.getTransactionSummaryId(), loopOfTransactionDetails.getAmount());
            } else {
                mapOfTransactionDetails.put(loopOfTransactionDetails.getTransactionSummaryId(), value.add(loopOfTransactionDetails.getAmount()));
            }
        }

        String string = (mapOfTransactionDetails.toString());

        return string;


        //        ListIterator<TransactionDetail> iter = abc.listIterator();
//        while (iter.hasNext()) {
//            aa.add(iter.next());
//            System.out.println("wartość : " + iter.next());
//        }

    }
}
