package com.example.personalFinanceTracker.repo;

import com.example.personalFinanceTracker.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransactionRepo extends JpaRepository<Transaction, UUID> {
  Transaction findByMemo(String memo);
}
