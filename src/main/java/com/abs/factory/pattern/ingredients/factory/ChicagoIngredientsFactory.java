package com.abs.factory.pattern.ingredients.factory;

import com.abs.factory.pattern.ingredients.Brocoli;
import com.abs.factory.pattern.ingredients.FrozenClam;
import com.abs.factory.pattern.ingredients.MozzarellaCheese;
import com.abs.factory.pattern.ingredients.Mushroom;
import com.abs.factory.pattern.ingredients.Onion;
import com.abs.factory.pattern.ingredients.Pumpkin;
import com.abs.factory.pattern.ingredients.ThickCrustDough;
import com.abs.factory.pattern.ingredients.TomatoSauce;
import com.abs.factory.pattern.ingredients.model.Cheese;
import com.abs.factory.pattern.ingredients.model.Clam;
import com.abs.factory.pattern.ingredients.model.Dough;
import com.abs.factory.pattern.ingredients.model.Sauce;
import com.abs.factory.pattern.ingredients.model.Veggie;
import java.util.ArrayList;
import java.util.List;

public class ChicagoIngredientsFactory implements IngredientsFactory {

  @Override
  public Dough createDough() {
    System.out.println("ThickCrustDough");
    return new ThickCrustDough();
  }

  @Override
  public Sauce createSauce() {
    System.out.println("TomatoSauce");
    return new TomatoSauce();
  }

  @Override
  public Cheese createCheese() {
    System.out.println("Mozzarella");
    return new MozzarellaCheese();
  }

  @Override
  public Clam createClam() {
    System.out.println("FrozenClam");
    return new FrozenClam();
  }

  @Override
  public List<Veggie> createVeggies(){
    List<Veggie> veggies = new ArrayList<>();
    System.out.println("Onion");
    veggies.add(new Onion());
    System.out.println("Pumpkin");
    veggies.add(new Pumpkin());
    System.out.println("Mushroom");
    veggies.add(new Mushroom());
    return veggies;

  }
}
