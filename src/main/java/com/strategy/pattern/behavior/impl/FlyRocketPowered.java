package com.strategy.pattern.behavior.impl;

import com.strategy.pattern.behavior.IFlyBehavior;

public class FlyRocketPowered implements IFlyBehavior {

  public void fly() {
    System.out.println("Flying like a rocket");
  }
}
