package com.abs.factory.pattern.store;

import com.abs.factory.pattern.pizza.Pizza;

public abstract class PizzaStore {
  public void orderPizza(String item){
    Pizza pizza = createPizza(item);
    cutPizza(pizza);
    boxPizza(pizza);

  }

  public abstract Pizza createPizza(String item);

  public void cutPizza(Pizza pizza){
    System.out.println("cutting pizza");
  }

  public void boxPizza(Pizza pizza){
    System.out.println("boxing pizza");
  }
}
