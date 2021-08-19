package com.factory.pattern.model;

import com.factory.pattern.enumeration.PizzaType;

public abstract class PizzaStore {

  public Pizza orderPizza(PizzaType type) {
    Pizza pizza = createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }

  public abstract Pizza createPizza(PizzaType type);
}
