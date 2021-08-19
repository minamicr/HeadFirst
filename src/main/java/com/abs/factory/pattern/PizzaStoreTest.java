package com.abs.factory.pattern;


import com.abs.factory.pattern.store.ChicagoPizzaStore;
import com.abs.factory.pattern.store.NyPizzaStore;

public class PizzaStoreTest {

  public static void main(String[] args) {
    NyPizzaStore nyPizzaStore = new NyPizzaStore();
    System.out.println("Ordering cheese pizza from NY Store");
    nyPizzaStore.orderPizza("CHEESE");

    ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
    System.out.println("Ordering cheese pizza from Chicago Store");
    chicagoPizzaStore.orderPizza("CHEESE");
  }
}
