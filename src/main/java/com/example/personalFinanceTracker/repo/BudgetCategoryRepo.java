package com.example.personalFinanceTracker.repo;

import com.example.personalFinanceTracker.domain.BudgetCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BudgetCategoryRepo extends JpaRepository<BudgetCategory, UUID> {
  BudgetCategory findByName(String name);
}
