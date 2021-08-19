package com.abs.factory.pattern.pizza;

import com.abs.factory.pattern.model.ingredients.Cheese;
import com.abs.factory.pattern.model.ingredients.Dough;
import com.abs.factory.pattern.model.ingredients.Sauce;

public abstract class Pizza {
  public Dough dough;
  public Cheese cheese;
  public Sauce sauce;

  public abstract void prepare();

  public void bake(){
    System.out.println("baking pizza");
  }

  public void cut() {
    System.out.println("cutting pizza");
  }
}
