package com.example.personalFinanceTracker.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

  @Id
  @GeneratedValue
  private UUID id;
  private String nickname;
  private Integer income;
  private Integer expenses;
  @CreationTimestamp
  private LocalDateTime createDateTime;
  @UpdateTimestamp
  private LocalDateTime updateDateTime;
  @ManyToOne
  private AppUser user;

}
