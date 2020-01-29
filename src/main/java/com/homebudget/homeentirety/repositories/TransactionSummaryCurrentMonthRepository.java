package com.homebudget.homeentirety.repositories;

import com.homebudget.homeentirety.models.TransactionDetail;
import com.homebudget.homeentirety.models.TransactionSummaryCurrentMonth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TransactionSummaryCurrentMonthRepository extends JpaRepository<TransactionSummaryCurrentMonth, Long> {



}
