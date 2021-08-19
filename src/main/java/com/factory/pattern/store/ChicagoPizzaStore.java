package com.factory.pattern.store;

import static com.factory.pattern.enumeration.PizzaType.CHEESE;

import com.factory.pattern.enumeration.PizzaType;
import com.factory.pattern.model.Pizza;
import com.factory.pattern.model.PizzaStore;
import com.factory.pattern.pizza.ChicagoStyleCheesePizza;
import com.factory.pattern.pizza.ChicagoStyleClamPizza;
import com.factory.pattern.pizza.ChicagoStylePepperoniPizza;
import com.factory.pattern.pizza.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {


  @Override
  public Pizza createPizza(PizzaType pizzaType) {
    switch (pizzaType) {
      case CHEESE:
        return new ChicagoStyleCheesePizza();
      case CLAM:
        return new ChicagoStyleClamPizza();
      case PEPPERONI:
        return new ChicagoStylePepperoniPizza();
      case VEGGIE:
        return new ChicagoStyleVeggiePizza();
    }

    return null;
  }
}
