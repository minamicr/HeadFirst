package com.factory.pattern.pizza;

import com.factory.pattern.model.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
  public ChicagoStylePepperoniPizza(){
    name = "Chicago Style Pepperoni Pizza";
    dough = "Extra Thick Crust Dough";
    sauce = "Plum Tomato Sauce";

    toppings.add("Shredded Mozzarella Cheese");
    toppings.add("Shredded Parmesan Cheese");
    toppings.add("Eggplant");
    toppings.add("Spinach");
    toppings.add("Black Olives");
    toppings.add("Pepperoni");
  }

}
