package com.observer.java.pattern;

import com.observer.pattern.model.DisplayElement;
import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

  private float currentPressure = 29.2f;
  private float lastPressure;

  public ForecastDisplay(Observable observable){
    observable.addObserver(this);
  }

  @Override
  public void update(Observable obs, Object arg) {
    if (obs instanceof WeatherData){
      WeatherData weatherData = (WeatherData)obs;
      lastPressure = currentPressure;
      currentPressure = weatherData.getPressure();
    }

    display();

  }

  @Override
  public void display(){
    System.out.println("Pressure changes from " + lastPressure + " to " + currentPressure);
  }
}
