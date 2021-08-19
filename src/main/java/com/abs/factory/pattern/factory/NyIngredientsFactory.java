package com.abs.factory.pattern.factory;

import com.abs.factory.pattern.ingredients.MarinaraSauce;
import com.abs.factory.pattern.ingredients.ReggianoCheese;
import com.abs.factory.pattern.ingredients.ThinCrustDough;
import com.abs.factory.pattern.model.ingredients.IngredientsFactory;
import com.abs.factory.pattern.model.ingredients.Cheese;
import com.abs.factory.pattern.model.ingredients.Dough;
import com.abs.factory.pattern.model.ingredients.Sauce;

public class NyIngredientsFactory implements IngredientsFactory {

  @Override
  public Dough createDough() {
    System.out.println("ThinCrustDough");
    return new ThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    System.out.println("MarinaraSauce");
    return new MarinaraSauce();
  }

  @Override
  public Cheese createCheese() {
    System.out.println("ReggianoCheese");
    return new ReggianoCheese();
  }

}
