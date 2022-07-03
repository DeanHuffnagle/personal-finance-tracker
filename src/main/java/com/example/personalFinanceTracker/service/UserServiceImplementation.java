package com.example.personalFinanceTracker.service;

import com.example.personalFinanceTracker.domain.Account;
import com.example.personalFinanceTracker.domain.AppUser;
import com.example.personalFinanceTracker.repo.AccountRepo;
import com.example.personalFinanceTracker.repo.AppUserRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
@Transactional
@Slf4j
public class UserServiceImplementation implements UserService, UserDetailsService {

  private final AppUserRepo userRepo;
  private final AccountRepo accountRepo;

  private final PasswordEncoder passwordEncoder;


  @Override
  public AppUser saveUser(AppUser user) {
    user.setPassword(passwordEncoder.encode(user.getPassword()));
    return userRepo.save(user);
  }

  @Override
  public Account saveAccount(Account account) {
    return accountRepo.save(account);
  }

  @Override
  public Optional<AppUser> getUser(UUID id) {
    return userRepo.findById(id);
  }



  @Override
  public List<AppUser> getUsers() {
    return userRepo.findAll();
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    return null;
  }
}
