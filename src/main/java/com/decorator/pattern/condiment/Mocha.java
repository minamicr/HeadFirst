package com.decorator.pattern.condiment;

import com.decorator.pattern.model.Beverage;
import com.decorator.pattern.model.CondimentDecorator;

public class Mocha extends CondimentDecorator {
  Beverage beverage;

  public Mocha(Beverage beverage){
    this.beverage = beverage;

  }

  public String getDescription(){
    return beverage.getDescription() + ", Mocha";
  }

  public double cost() {
    return .20 + beverage.cost();
  }
}
