package com.abs.factory.pattern.store;


import com.abs.factory.pattern.factory.NyIngredientsFactory;
import com.abs.factory.pattern.pizza.Pizza;
import com.abs.factory.pattern.model.ingredients.IngredientsFactory;
import com.abs.factory.pattern.pizza.CheesePizza;

public class NyPizzaStore extends PizzaStore {
  IngredientsFactory ingredientsFactory = new NyIngredientsFactory();


  @Override
  public Pizza createPizza(String item) {
    if("CHEESE".equalsIgnoreCase(item)){
      return new CheesePizza(ingredientsFactory);
    }
    return null;
  }
}
