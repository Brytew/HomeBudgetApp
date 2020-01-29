package com.homebudget.homeentirety.repositories;

import com.homebudget.homeentirety.models.TransactionDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TransactionDetailRepository extends JpaRepository<TransactionDetail, Long> {

    List<TransactionDetail> findAllBytransactionSummaryId(Long transactionSummaryId);

    @Query("SELECT u FROM TransactionDetail u where u.createdAt >= '2020-01-28T01:15:10.0330242' AND u.createdAt <= '2020-01-28T23:17:10.2062679'")
    List<TransactionDetail> getCurrentMonthExpensesQuery();
}
