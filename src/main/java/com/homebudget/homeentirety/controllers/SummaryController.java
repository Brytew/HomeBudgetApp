package com.homebudget.homeentirety.controllers;

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
    public List<Object> list() {
        return summaryRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{ID}")
    public Object get(@PathVariable Integer ID) {
        return summaryRepository.getOne(ID);
      }

    @PostMapping
    public Object create (@RequestBody final Object summary) {
        return summaryRepository.saveAndFlush(summary);
    }

    @RequestMapping (value = "{ID", method = RequestMethod.DELETE)
    public void delete (@PathVariable Integer ID) {
        summaryRepository.deleteById(ID);
    }

}
