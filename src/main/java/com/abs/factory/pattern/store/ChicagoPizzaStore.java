package com.abs.factory.pattern.store;

import com.abs.factory.pattern.ingredients.factory.ChicagoIngredientsFactory;
import com.abs.factory.pattern.ingredients.factory.IngredientsFactory;
import com.abs.factory.pattern.pizza.CheesePizza;
import com.abs.factory.pattern.pizza.ClamPizza;
import com.abs.factory.pattern.pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore{
  IngredientsFactory chicagoIngredientsFactory = new ChicagoIngredientsFactory();

  @Override
  public com.abs.factory.pattern.pizza.Pizza createPizza(String item) {
    if ("CHEESE".equals(item))
      return new CheesePizza(chicagoIngredientsFactory);
    else if ("CLAM".equals(item))
      return new ClamPizza(chicagoIngredientsFactory);
    else if ("VEGGIE".equals(item))
      return new VeggiePizza(chicagoIngredientsFactory);
    else
      return null;
  }
}
