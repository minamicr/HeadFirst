package com.abs.factory.pattern.pizza;

import com.abs.factory.pattern.ingredients.factory.IngredientsFactory;

public class ClamPizza extends Pizza{
  IngredientsFactory ingredientsFactory;

  public ClamPizza(IngredientsFactory ingredientsFactory){
    this.ingredientsFactory = ingredientsFactory;
    prepare();
  }

  @Override
  public void prepare() {
    System.out.println("Preparing clam pizza");
    dough = ingredientsFactory.createDough();
    sauce = ingredientsFactory.createSauce();
    clam = ingredientsFactory.createClam();
  }
}
