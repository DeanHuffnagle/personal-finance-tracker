package com.example.personalFinanceTracker.repo;

import com.example.personalFinanceTracker.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AppUserRepo extends JpaRepository<AppUser, UUID> {
  AppUser findByUsername(String username);
  Optional<AppUser> findById(UUID id);
}
