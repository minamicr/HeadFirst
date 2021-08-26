package com.abs.factory.pattern.pizza;

import com.abs.factory.pattern.ingredients.model.Cheese;
import com.abs.factory.pattern.ingredients.model.Clam;
import com.abs.factory.pattern.ingredients.model.Dough;
import com.abs.factory.pattern.ingredients.model.Sauce;
import com.abs.factory.pattern.ingredients.model.Veggie;
import java.util.List;

public abstract class Pizza {
  public Dough dough;
  public Cheese cheese;
  public Sauce sauce;
  public Clam clam;
  public List<Veggie> veggies;

  public abstract void prepare();

  public void bake(){
    System.out.println("baking pizza");
  }

  public void cut() {
    System.out.println("cutting pizza");
  }
}
