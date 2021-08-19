package com.factory.pattern;

import com.factory.pattern.enumeration.PizzaType;
import com.factory.pattern.model.Pizza;
import com.factory.pattern.model.PizzaStore;
import com.factory.pattern.store.ChicagoPizzaStore;
import com.factory.pattern.store.NYPizzaStore;

public class PizzaTestDrive {

  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();
    Pizza cheeseNy = nyStore.orderPizza(PizzaType.CHEESE);
    System.out.println("Ethan ordered a " + cheeseNy.getName() + "\n");

    Pizza clamNy = nyStore.orderPizza(PizzaType.CLAM);
    System.out.println("Ethan ordered a " + clamNy.getName() + "\n");

    Pizza pepperoniNy = nyStore.orderPizza(PizzaType.PEPPERONI);
    System.out.println("Ethan ordered a " + pepperoniNy.getName() + "\n");

    Pizza veggieNy = nyStore.orderPizza(PizzaType.VEGGIE);
    System.out.println("Ethan ordered a " + veggieNy.getName() + "\n");

    PizzaStore chicagoStore = new ChicagoPizzaStore();
    Pizza cheeseChicago = chicagoStore.orderPizza(PizzaType.CHEESE);
    System.out.println("Rebecca ordered a " + cheeseChicago.getName() + "\n");

    Pizza clamChicago = chicagoStore.orderPizza(PizzaType.CLAM);
    System.out.println("Rebecca ordered a " + clamChicago.getName() + "\n");

    Pizza pepperoniChicago = chicagoStore.orderPizza(PizzaType.PEPPERONI);
    System.out.println("Rebecca ordered a " + pepperoniChicago.getName() + "\n");

    Pizza veggieChicago = chicagoStore.orderPizza(PizzaType.VEGGIE);
    System.out.println("Rebecca ordered a " + veggieChicago.getName() + "\n");


  }

}
