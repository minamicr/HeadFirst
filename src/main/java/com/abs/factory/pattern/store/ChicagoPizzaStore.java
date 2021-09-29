package com.abs.factory.pattern.store;

import com.abs.factory.pattern.ingredients.factory.ChicagoIngredientsFactory;
import com.abs.factory.pattern.pizza.CheesePizza;
import com.abs.factory.pattern.pizza.ClamPizza;
import com.abs.factory.pattern.pizza.PizzaType;
import com.abs.factory.pattern.pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore{
  private ChicagoIngredientsFactory chicagoIngredientsFactory;

  @Override
  public com.abs.factory.pattern.pizza.Pizza createPizza(PizzaType item) {
    chicagoIngredientsFactory = getIngredients();

    switch (item) {
      case CHEESE:
        return new CheesePizza(chicagoIngredientsFactory);
      case CLAM:
        return new ClamPizza(chicagoIngredientsFactory);
      case VEGGIE:
        return new VeggiePizza(chicagoIngredientsFactory);
      default:
        return null;
    }

  }

  public ChicagoIngredientsFactory getIngredients(){
    return new ChicagoIngredientsFactory();
  }
}
