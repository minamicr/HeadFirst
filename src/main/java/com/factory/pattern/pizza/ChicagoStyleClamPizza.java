package com.factory.pattern.pizza;

import com.factory.pattern.model.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
  public ChicagoStyleClamPizza(){
    name = "Chicago Style Clam Pizza";
    dough = "Extra Thick Crust Dough";
    sauce = "Plum Tomato Sauce";

    toppings.add("Shredded Mozzarella Cheese");
    toppings.add("Shredded Parmesan Cheese");
    toppings.add("Clams");
  }

}
