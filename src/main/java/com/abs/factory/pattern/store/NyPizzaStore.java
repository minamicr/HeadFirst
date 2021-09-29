package com.abs.factory.pattern.store;


import com.abs.factory.pattern.ingredients.factory.NyIngredientsFactory;
import com.abs.factory.pattern.pizza.ClamPizza;
import com.abs.factory.pattern.pizza.Pizza;
import com.abs.factory.pattern.ingredients.factory.IngredientsFactory;
import com.abs.factory.pattern.pizza.CheesePizza;
import com.abs.factory.pattern.pizza.PizzaType;
import com.abs.factory.pattern.pizza.VeggiePizza;

public class NyPizzaStore extends PizzaStore {
  IngredientsFactory ingredientsFactory = new NyIngredientsFactory();


  @Override
  public Pizza createPizza(PizzaType item) {
    switch (item) {
      case CHEESE:
        return new CheesePizza(ingredientsFactory);
      case CLAM:
        return new ClamPizza(ingredientsFactory);
      case VEGGIE:
        return new VeggiePizza(ingredientsFactory);
      default:
        return null;
    }

  }
}
