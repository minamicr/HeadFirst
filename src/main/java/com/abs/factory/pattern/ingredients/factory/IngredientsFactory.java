package com.abs.factory.pattern.ingredients.factory;

import com.abs.factory.pattern.ingredients.model.Cheese;
import com.abs.factory.pattern.ingredients.model.Clam;
import com.abs.factory.pattern.ingredients.model.Dough;
import com.abs.factory.pattern.ingredients.model.Sauce;
import com.abs.factory.pattern.ingredients.model.Veggie;
import java.util.List;

public interface IngredientsFactory {
  Dough createDough();
  Sauce createSauce();
  Cheese createCheese();
  Clam createClam();
  List<Veggie> createVeggies();

}
