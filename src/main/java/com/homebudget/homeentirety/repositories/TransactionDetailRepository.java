package com.homebudget.homeentirety.repositories;

import com.homebudget.homeentirety.models.TransactionDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TransactionDetailRepository extends JpaRepository<TransactionDetail, Long> {

    List<TransactionDetail> findAllByTransactionSummaryId(Long transactionSummaryId);

    @Query("SELECT u FROM TransactionDetail u where u.createdAt >= '2020-04-10T00:00:01.00' AND u.createdAt <= '2020-05-09T23:59:59.00'")
    List<TransactionDetail> getCurrentMonthExpensesQuery();
}
