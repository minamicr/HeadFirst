package com.abs.factory.pattern.pizza;

import com.abs.factory.pattern.model.ingredients.IngredientsFactory;

public class CheesePizza extends Pizza {
  IngredientsFactory ingredientsFactory;

  public CheesePizza(IngredientsFactory ingredientsFactory){
    this.ingredientsFactory = ingredientsFactory;
    prepare();
  }

  public void prepare(){
    System.out.println("Preparing pizza");
    dough = ingredientsFactory.createDough();
    sauce = ingredientsFactory.createSauce();
    cheese = ingredientsFactory.createCheese();
  }

}
