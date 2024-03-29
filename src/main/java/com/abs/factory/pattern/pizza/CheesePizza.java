package com.abs.factory.pattern.pizza;

import com.abs.factory.pattern.ingredients.factory.IngredientsFactory;

public class CheesePizza extends Pizza {
  IngredientsFactory ingredientsFactory;

  public CheesePizza(IngredientsFactory ingredientsFactory){
    this.ingredientsFactory = ingredientsFactory;
    prepare();
  }

  public void prepare(){
    System.out.println("Preparing cheese pizza");
    dough = ingredientsFactory.createDough();
    sauce = ingredientsFactory.createSauce();
    cheese = ingredientsFactory.createCheese();
  }

}
