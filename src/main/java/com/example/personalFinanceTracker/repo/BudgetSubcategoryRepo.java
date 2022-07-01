package com.example.personalFinanceTracker.repo;


import com.example.personalFinanceTracker.domain.BudgetSubcategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BudgetSubcategoryRepo extends JpaRepository<BudgetSubcategory, UUID> {
  BudgetSubcategory findByName(String name);
}
