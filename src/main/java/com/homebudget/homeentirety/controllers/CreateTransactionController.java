package com.homebudget.homeentirety.controllers;


import com.homebudget.homeentirety.models.TransactionDetail;
import com.homebudget.homeentirety.repositories.TransactionDetailRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Data
@Controller
@RequestMapping("/add")
public class CreateTransactionController {

    @Autowired
    private TransactionDetailRepository transactionDetailRepository;

    @PostMapping
    public TransactionDetail createTransaction(@ModelAttribute final TransactionDetail transactionDetail) {
        return transactionDetailRepository.saveAndFlush(transactionDetail);
    }

    @GetMapping
    public String Add(Model model) {
        model.addAttribute("transactionDetail", new TransactionDetail());
        return "add";
    }


//    @PostMapping
//    public String addTransaction(TransactionDetail test) {
//        log.info("Widzę dodawaną transakcję w konsoli: " + test);
//        return "redirect:/add";
//    }
}