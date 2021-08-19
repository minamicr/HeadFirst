package com.abs.factory.pattern.store;

import com.abs.factory.pattern.factory.ChicagoIngredientsFactory;
import com.abs.factory.pattern.pizza.CheesePizza;
import com.abs.factory.pattern.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
  ChicagoIngredientsFactory chicagoIngredientsFactory = new ChicagoIngredientsFactory();

  @Override
  public com.abs.factory.pattern.pizza.Pizza createPizza(String item) {
    if ("CHEESE".equals(item))
      return new CheesePizza(chicagoIngredientsFactory);

    return null;
  }
}
