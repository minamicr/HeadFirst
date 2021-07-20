package com.strategy.pattern.behavior.impl;

import com.strategy.pattern.behavior.IQuackBehavior;

public class Quack implements IQuackBehavior {

  public void quack() {
    System.out.println("Quack quack");
  }
}
