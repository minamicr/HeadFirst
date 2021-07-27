package com.decorator.pattern.beverage;

import com.decorator.pattern.model.Beverage;

public class Espresso extends Beverage {

  public Espresso() {
    description = "Espresso";
  }

  public double cost() {
    return 1.99;
  }
}
