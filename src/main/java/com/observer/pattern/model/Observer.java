package com.observer.pattern.model;

public interface Observer {
  void update(float temp, float humidity, float pressure);
}
