package com.beuben.rpginvmanager.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Character {
  private Integer id;
  private String name;
  private Inventory inventory;
}
