package com.abs.factory.pattern.store;

import com.abs.factory.pattern.pizza.Pizza;
import com.abs.factory.pattern.pizza.PizzaType;

public abstract class PizzaStore {
  public void orderPizza(PizzaType item){
    Pizza pizza = createPizza(item);
    cutPizza(pizza);
    boxPizza(pizza);

  }

  public abstract Pizza createPizza(PizzaType item);

  public void cutPizza(Pizza pizza){
    System.out.println("cutting pizza");
  }

  public void boxPizza(Pizza pizza){
    System.out.println("boxing pizza");
  }
}
