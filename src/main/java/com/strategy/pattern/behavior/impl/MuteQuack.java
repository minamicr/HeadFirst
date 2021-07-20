package com.strategy.pattern.behavior.impl;

import com.strategy.pattern.behavior.IQuackBehavior;

public class MuteQuack implements IQuackBehavior {

  public void quack() {
    System.out.println("No sound heard");
  }
}
