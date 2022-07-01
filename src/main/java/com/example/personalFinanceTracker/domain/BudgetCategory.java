package com.example.personalFinanceTracker.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BudgetCategory {

  @Id
  @GeneratedValue
  private UUID id;
  private String name;
  private Integer amount;
  @ManyToOne
  private AppUser user;
}
