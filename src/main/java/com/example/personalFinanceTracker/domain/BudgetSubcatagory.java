package com.example.personalFinanceTracker.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BudgetSubcatagory {

  @Id
  @GeneratedValue
  private UUID id;
  private String name;
  private Integer amount;
  @ManyToOne
  private BudgetCatagory budgetCatagory;
}
