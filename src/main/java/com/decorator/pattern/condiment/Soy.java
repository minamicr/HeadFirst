package com.decorator.pattern.condiment;

import com.decorator.pattern.model.Beverage;
import com.decorator.pattern.model.CondimentDecorator;

public class Soy extends CondimentDecorator {
  Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription(){
    return beverage.getDescription() + ", Soy";
  }

  public double cost(){
    return .15 + beverage.cost();
  }
}
