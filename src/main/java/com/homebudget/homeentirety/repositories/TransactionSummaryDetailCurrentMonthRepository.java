package com.homebudget.homeentirety.repositories;

import com.homebudget.homeentirety.models.TransactionDetail;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TransactionSummaryDetailCurrentMonthRepository extends JpaRepository<TransactionDetail, Long> {
}
