package com.beuben.rpginvmanager.entities;

import lombok.Getter;

import java.util.List;

@Getter
public class Inventory {
  private List<Item> items;
  private Integer size;

  public Inventory(Integer size) {
    this.size = size;
  }

  public void increaseSize(Integer nbSlots) {
    this.size += nbSlots;
  }
}
