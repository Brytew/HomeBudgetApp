package com.homebudget.homeentirety.repositories;

import com.homebudget.homeentirety.models.Summary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SummaryRepository extends JpaRepository<Summary, Integer> {
}
