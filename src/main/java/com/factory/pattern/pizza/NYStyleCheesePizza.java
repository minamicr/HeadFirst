package com.factory.pattern.pizza;

import com.factory.pattern.model.Pizza;

public class NYStyleCheesePizza extends Pizza {
  public NYStyleCheesePizza(){
    name = "NY Style Sauce and Cheese Pizza";
    dough = "Thin Crust Dough";
    sauce = "Marinara Sauce";

    toppings.add("Grated Reggiano Cheese");
  }

}
