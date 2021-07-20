package com.strategy.pattern.behavior.impl;

import com.strategy.pattern.behavior.IQuackBehavior;

public class Squeak implements IQuackBehavior {

  public void quack() {
    System.out.println("squeak squeak");
  }
}
