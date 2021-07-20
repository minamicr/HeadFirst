package com.strategy.pattern.model;

import com.strategy.pattern.behavior.IFlyBehavior;
import com.strategy.pattern.behavior.IQuackBehavior;

public class Duck {
  private String color;
  private Double weight;
  private IFlyBehavior flyBehavior;
  private IQuackBehavior quackBehavior;

  public Duck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior){
    this.flyBehavior = flyBehavior;
    this.quackBehavior = quackBehavior;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public void swim(){
    System.out.println("I know how to swim");
  }

  public void setFlyBehavior(IFlyBehavior flyBehavior){
    this.flyBehavior = flyBehavior;
  }

  public void display(){
    System.out.println(String.format("The duck color is %s and weight %d"
        , color, weight));
  }

  public void performFly(){
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }
}
