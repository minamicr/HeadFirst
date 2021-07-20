package com.strategy.pattern;

import com.strategy.pattern.behavior.impl.FlyRocketPowered;
import com.strategy.pattern.behavior.impl.FlyWithWings;
import com.strategy.pattern.model.Duck;
import com.strategy.pattern.model.DuckCall;
import com.strategy.pattern.model.MallardDuck;
import com.strategy.pattern.model.ModelDuck;

public class DuckSimulator {

  public static void main(String[] args) {
    Duck mallardDuck = new MallardDuck();
    mallardDuck.performFly();
    mallardDuck.performQuack();

    Duck modelDuck = new ModelDuck();
    modelDuck.performQuack();
    modelDuck.performFly();
    modelDuck.setFlyBehavior(new FlyRocketPowered());
    modelDuck.performFly();

    DuckCall duckCall = new DuckCall();
    duckCall.quack();

  }
}
