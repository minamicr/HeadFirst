package com.strategy.pattern.behavior.impl;

import com.strategy.pattern.behavior.IFlyBehavior;

public class FlyWithWings implements IFlyBehavior {

  public void fly() {
    System.out.println("Flying with wings");
  }
}
