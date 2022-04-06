package com.beuben.rpginvmanager.entities;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Item {
  private BigDecimal life;
  private BigDecimal force;
  private BigDecimal luck;
}
