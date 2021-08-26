package com.abs.factory.pattern.pizza;

import com.abs.factory.pattern.ingredients.factory.IngredientsFactory;

public class VeggiePizza extends Pizza{
  IngredientsFactory ingredientsFactory;

  public VeggiePizza(IngredientsFactory ingredientsFactory){
    this.ingredientsFactory = ingredientsFactory;
    prepare();
  }

  @Override
  public void prepare() {
    System.out.println("Preparing veggie pizza");
    dough = ingredientsFactory.createDough();
    sauce = ingredientsFactory.createSauce();
    cheese = ingredientsFactory.createCheese();
    veggies = ingredientsFactory.createVeggies();
  }
}
