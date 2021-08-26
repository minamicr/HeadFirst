package com.abs.factory.pattern.ingredients.factory;

import com.abs.factory.pattern.ingredients.Brocoli;
import com.abs.factory.pattern.ingredients.FreshClam;
import com.abs.factory.pattern.ingredients.MarinaraSauce;
import com.abs.factory.pattern.ingredients.Mushroom;
import com.abs.factory.pattern.ingredients.Onion;
import com.abs.factory.pattern.ingredients.ReggianoCheese;
import com.abs.factory.pattern.ingredients.ThinCrustDough;
import com.abs.factory.pattern.ingredients.model.Cheese;
import com.abs.factory.pattern.ingredients.model.Clam;
import com.abs.factory.pattern.ingredients.model.Dough;
import com.abs.factory.pattern.ingredients.model.Sauce;
import com.abs.factory.pattern.ingredients.model.Veggie;
import java.util.ArrayList;
import java.util.List;

public class NyIngredientsFactory implements IngredientsFactory {

  @Override
  public Dough createDough() {
    System.out.println("ThinCrustDough");
    return new ThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    System.out.println("MarinaraSauce");
    return new MarinaraSauce();
  }

  @Override
  public Cheese createCheese() {
    System.out.println("ReggianoCheese");
    return new ReggianoCheese();
  }

  @Override
  public Clam createClam() {
    System.out.println("FreshClam");
    return new FreshClam();
  }

  @Override
  public List<Veggie> createVeggies(){
    List<Veggie> veggies = new ArrayList<>();
    System.out.println("Onion");
    veggies.add(new Onion());
    System.out.println("Brocoli");
    veggies.add(new Brocoli());
    System.out.println("Mushroom");
    veggies.add(new Mushroom());
    return veggies;

  }

}
