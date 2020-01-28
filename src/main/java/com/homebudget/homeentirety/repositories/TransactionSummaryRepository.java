package com.homebudget.homeentirety.repositories;

import com.homebudget.homeentirety.models.TransactionSummary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionSummaryRepository extends JpaRepository<TransactionSummary, Integer> {
}
