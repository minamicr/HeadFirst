package com.decorator.pattern.beverage;

import com.decorator.pattern.model.Beverage;

public class HouseBlend extends Beverage {
  public HouseBlend(){
    description = "House Blend Coffee";
  }

  public double cost() {
    return .89;
  }
}
