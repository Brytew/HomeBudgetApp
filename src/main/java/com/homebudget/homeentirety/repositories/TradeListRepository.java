package com.homebudget.homeentirety.repositories;

import com.homebudget.homeentirety.models.TransactionList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TradeListRepository extends JpaRepository<TransactionList, Integer> {
}