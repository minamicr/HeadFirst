package com.strategy.pattern.model;

import com.strategy.pattern.behavior.impl.FlyWithWings;
import com.strategy.pattern.behavior.impl.Quack;

public class MallardDuck extends Duck {
  public MallardDuck() {
    super(new FlyWithWings(), new Quack());
    System.out.println("---- Mallard Duck ----");
  }
}
