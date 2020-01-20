package com.homebudget.homeentirety.controllers;

import com.homebudget.homeentirety.models.MonthlyExpenses;
import com.homebudget.homeentirety.repositories.MonthlyExpensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/expenses")
public class MonthlyExpensesController {

    @Autowired
    private MonthlyExpensesRepository monthlyExpensesRepository;

    @GetMapping
    public List<MonthlyExpenses> list() {
        return monthlyExpensesRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{ID}")
    public MonthlyExpenses get(@PathVariable Integer ID) {
        return monthlyExpensesRepository.getOne(ID);
      }

    @PostMapping
    public MonthlyExpenses create (@RequestBody final MonthlyExpenses monthlyExpenses) {
        return monthlyExpensesRepository.saveAndFlush(monthlyExpenses);
    }

    @RequestMapping (value = "{ID", method = RequestMethod.DELETE)
    public void delete (@PathVariable Integer ID) {
        monthlyExpensesRepository.deleteById(ID);
    }

}
