package com.factory.pattern.store;

import com.factory.pattern.enumeration.PizzaType;
import com.factory.pattern.model.Pizza;
import com.factory.pattern.model.PizzaStore;
import com.factory.pattern.pizza.NYStyleCheesePizza;
import com.factory.pattern.pizza.NYStyleClamPizza;
import com.factory.pattern.pizza.NYStylePepperoniPizza;
import com.factory.pattern.pizza.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

  @Override
  public Pizza createPizza(PizzaType pizzaType) {

    switch (pizzaType) {
      case CHEESE:
        return new NYStyleCheesePizza();
      case CLAM:
        return new NYStyleClamPizza();
      case PEPPERONI:
        return new NYStylePepperoniPizza();
      case VEGGIE:
        return new NYStyleVeggiePizza();

    }

    return null;
  }
}
