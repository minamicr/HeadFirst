package com.abs.factory.pattern.factory;

import com.abs.factory.pattern.ingredients.MozzarellaCheese;
import com.abs.factory.pattern.ingredients.ThickCrustDough;
import com.abs.factory.pattern.ingredients.TomatoSauce;
import com.abs.factory.pattern.model.ingredients.Cheese;
import com.abs.factory.pattern.model.ingredients.Dough;
import com.abs.factory.pattern.model.ingredients.IngredientsFactory;
import com.abs.factory.pattern.model.ingredients.Sauce;

public class ChicagoIngredientsFactory implements IngredientsFactory {

  @Override
  public Dough createDough() {
    System.out.println("ThickCrustDough");
    return new ThickCrustDough();
  }

  @Override
  public Sauce createSauce() {
    System.out.println("TomatoSauce");
    return new TomatoSauce();
  }

  @Override
  public Cheese createCheese() {
    System.out.println("Mozzarella");
    return new MozzarellaCheese();
  }
}
