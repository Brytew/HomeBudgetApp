package com.homebudget.homeentirety.controllers;

import com.homebudget.homeentirety.models.Summary;
import com.homebudget.homeentirety.repositories.SummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/summary")
public class SummaryController {

    @Autowired
    private SummaryRepository summaryRepository;

    @GetMapping
    public List<Summary> list() {
        return summaryRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{ID}")
    public Summary get(@PathVariable Integer ID) {
        return summaryRepository.getOne(ID);
      }

    @PostMapping
    public Summary createSummary (@RequestBody final Summary summary) {
        return summaryRepository.saveAndFlush(summary);
    }

    @RequestMapping (value = "{ID", method = RequestMethod.DELETE)
    public void delete (@PathVariable Integer ID) {
        summaryRepository.deleteById(ID);
    }

}
