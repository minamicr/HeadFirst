package com.singleton;

import static org.assertj.core.api.BDDAssertions.then;

import org.junit.jupiter.api.Test;

class SimpleTest {

  @Test
  void createSimpleSingleton(){
    System.out.println("creating");
    Simple simple = Simple.getInstance();
    then(simple).isNotNull();
  }
}
