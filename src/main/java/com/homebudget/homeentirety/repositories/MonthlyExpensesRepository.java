package com.homebudget.homeentirety.repositories;

import com.homebudget.homeentirety.models.MonthlyExpenses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonthlyExpensesRepository extends JpaRepository<MonthlyExpenses, Integer> {
}
