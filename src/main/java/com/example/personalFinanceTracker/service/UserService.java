package com.example.personalFinanceTracker.service;

import com.example.personalFinanceTracker.domain.Account;
import com.example.personalFinanceTracker.domain.AppUser;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {
  AppUser saveUser(AppUser user);
  Account saveAccount(Account account);
  Optional<AppUser> getUser(UUID id);
  List<AppUser> getUsers();
}
