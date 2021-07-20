package com.strategy.pattern.model;

import com.strategy.pattern.behavior.impl.FlyNoWay;
import com.strategy.pattern.behavior.impl.MuteQuack;

public class ModelDuck extends Duck{

  public ModelDuck(){
    super(new FlyNoWay(), new MuteQuack());
    System.out.println("---- Model Duck ----");
  }

}
