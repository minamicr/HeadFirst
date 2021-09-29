package com.abs.factory.pattern.store;

import static org.assertj.core.api.BDDAssertions.then;
import static org.mockito.Mockito.when;

import com.abs.factory.pattern.ingredients.FrozenClam;
import com.abs.factory.pattern.ingredients.factory.ChicagoIngredientsFactory;
import com.abs.factory.pattern.pizza.Pizza;
import com.abs.factory.pattern.pizza.PizzaType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ChicagoPizzaStoreTest {

  @Mock
  private ChicagoIngredientsFactory ingredientsFactory;

  @InjectMocks
  private ChicagoPizzaStore chicagoPizzaStore;


  @Test
  void givenClamChigadoOrderWhenCreatePizzaThenReturnFrozenClam(){
    //CDM NEEDS WORK
    ingredientsFactory = new ChicagoIngredientsFactory();
    FrozenClam frozenClam = new FrozenClam();

    when(chicagoPizzaStore.getIngredients()).thenReturn(ingredientsFactory);

    Pizza result = chicagoPizzaStore.createPizza(PizzaType.CLAM);

    then(result.clam).isEqualTo(frozenClam);
  }

}