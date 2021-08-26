package com.abs.factory.pattern.store;


import com.abs.factory.pattern.ingredients.factory.NyIngredientsFactory;
import com.abs.factory.pattern.pizza.ClamPizza;
import com.abs.factory.pattern.pizza.Pizza;
import com.abs.factory.pattern.ingredients.factory.IngredientsFactory;
import com.abs.factory.pattern.pizza.CheesePizza;
import com.abs.factory.pattern.pizza.VeggiePizza;

public class NyPizzaStore extends PizzaStore {
  IngredientsFactory ingredientsFactory = new NyIngredientsFactory();


  @Override
  public Pizza createPizza(String item) {
    if("CHEESE".equalsIgnoreCase(item))
      return new CheesePizza(ingredientsFactory);
    else if ("CLAM".equals(item))
      return new ClamPizza(ingredientsFactory);
    else if ("VEGGIE".equals(item))
      return new VeggiePizza(ingredientsFactory);
    else
      return null;
  }
}
