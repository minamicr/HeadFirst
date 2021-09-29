package com.singleton;

public class Simple {
  private static Simple simpleSingleton = new Simple();

  public static Simple getInstance(){
    return simpleSingleton;
  }

}
