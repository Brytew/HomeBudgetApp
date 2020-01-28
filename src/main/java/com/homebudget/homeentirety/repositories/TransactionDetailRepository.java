package com.homebudget.homeentirety.repositories;

import com.homebudget.homeentirety.models.TransactionDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionDetailRepository extends JpaRepository<TransactionDetail, Integer> {
    List<TransactionDetail> findAllBytransactionSummaryId(Long transactionSummaryId);
}
