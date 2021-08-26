package com.abs.factory.pattern;


import com.abs.factory.pattern.store.ChicagoPizzaStore;
import com.abs.factory.pattern.store.NyPizzaStore;

public class PizzaStoreTest {

  public static void main(String[] args) {
    NyPizzaStore nyPizzaStore = new NyPizzaStore();
    System.out.println("Ordering pizzas from NY Store");
    nyPizzaStore.orderPizza("CLAM");
    nyPizzaStore.orderPizza("CHEESE");
    nyPizzaStore.orderPizza("VEGGIE");

    System.out.println("-------------------------");

    ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
    System.out.println("Ordering pizzas from Chicago Store");
    chicagoPizzaStore.orderPizza("CLAM");
    chicagoPizzaStore.orderPizza("CHEESE");
    chicagoPizzaStore.orderPizza("VEGGIE");

  }
}
