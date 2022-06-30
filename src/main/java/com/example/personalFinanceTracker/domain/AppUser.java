package com.example.personalFinanceTracker.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {

  @Id
  @GeneratedValue
  private UUID id;
  private String username;
  private String password;
  @CreationTimestamp
  private LocalDateTime createDateTime;
  @UpdateTimestamp
  private LocalDateTime updateDateTime;


}
