package com.decorator.pattern;

import com.decorator.pattern.beverage.Espresso;
import com.decorator.pattern.beverage.HouseBlend;
import com.decorator.pattern.condiment.Mocha;
import com.decorator.pattern.condiment.Soy;
import com.decorator.pattern.condiment.Whip;
import com.decorator.pattern.model.Beverage;
import javax.crypto.spec.PSource;

public class StarbuzzCoffee {

  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + " $" + beverage.cost());

    Beverage beverage1 = new HouseBlend();
    beverage1 = new Soy(beverage1);
    beverage1 = new Mocha(beverage1);
    beverage1 = new Whip(beverage1);

    System.out.println(beverage1.getDescription()) ;
    System.out.println(" $" + beverage1.cost());
  }

}
