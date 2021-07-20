package com.observer.pattern.display;

import com.observer.pattern.WeatherData;
import com.observer.pattern.model.DisplayElement;
import com.observer.pattern.model.Observer;
import com.observer.pattern.model.Subject;

public class HeatIndexDisplay implements Observer, DisplayElement {
  private final static float RH = 55f;
  private float temperature;
  private float humidity;
  private Subject weatherData;

  public HeatIndexDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println("Index heat " + calculateIndexHeat());
  }

  @Override
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }

  private float calculateIndexHeat(){
    return 16.923f + 1.85212f * 10-1 * temperature + 5.37941f * humidity;
  }
}
