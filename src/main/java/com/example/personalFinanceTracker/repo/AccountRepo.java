package com.example.personalFinanceTracker.repo;

import com.example.personalFinanceTracker.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AccountRepo extends JpaRepository<Account, UUID> {
    Account findByNickname(String nickname);
}
