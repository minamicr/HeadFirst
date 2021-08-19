package com.factory.pattern.pizza;

import com.factory.pattern.model.Pizza;

public class NYStyleClamPizza extends Pizza {

  public NYStyleClamPizza(){
    name = "NY Style Clam Pizza";
    dough = "Thin Crust Dough";
    sauce = "Marinara Sauce";

    toppings.add("Grated Reggiano Cheese");
    toppings.add("Fresh Clams");

  }
}
