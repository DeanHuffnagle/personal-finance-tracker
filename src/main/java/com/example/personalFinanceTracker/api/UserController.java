package com.example.personalFinanceTracker.api;

import com.example.personalFinanceTracker.domain.AppUser;
import com.example.personalFinanceTracker.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(path = "api/v1")
@RequiredArgsConstructor
public class UserController {
  private final UserService userService;

  @GetMapping(path = "/users")
  public ResponseEntity<List<AppUser>> getUsers() {
    return ResponseEntity.ok().body(userService.getUsers());
  }


  @GetMapping(path = "/users/{id}")
  public ResponseEntity<Optional<AppUser>> getUser(@PathVariable("id") UUID id) {

    return ResponseEntity.ok().body(userService.getUser(id));
  }





}
