package com.strategy.pattern.model;

import com.strategy.pattern.behavior.IFlyBehavior;
import com.strategy.pattern.behavior.IQuackBehavior;
import com.strategy.pattern.behavior.impl.FlyNoWay;
import com.strategy.pattern.behavior.impl.Quack;

public class DuckCall implements IQuackBehavior {

  public DuckCall(){
    System.out.println("---- Duck Call ----");
  }

  public void quack() {
    IQuackBehavior quackBehavior = new Quack();
    quackBehavior.quack();
  }
}
