package com.abs.factory.pattern.model.ingredients;

public interface IngredientsFactory {
  Dough createDough();
  Sauce createSauce();
  Cheese createCheese();

}
