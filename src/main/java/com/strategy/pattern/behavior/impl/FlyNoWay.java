package com.strategy.pattern.behavior.impl;

import com.strategy.pattern.behavior.IFlyBehavior;

public class FlyNoWay implements IFlyBehavior {

  public void fly() {
    System.out.println("I can´t fly");
  }
}
