package com.observer.pattern.display;

import com.observer.pattern.WeatherData;
import com.observer.pattern.model.DisplayElement;
import com.observer.pattern.model.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
  WeatherData weatherData;
  float temperature ;
  float humidity ;
  boolean increaseTemperature;
  boolean increaseHumidity;

  public ForecastDisplay(WeatherData subject){
    this.weatherData = subject;
    subject.registerObserver(this);

  }

  @Override
  public void update(float temperature, float humidity, float pressure) {
    updateForecast(temperature, humidity);
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }

  private void updateForecast(float temperature, float humidity){
    increaseTemperature = this.temperature < temperature;
    increaseHumidity = this.humidity < humidity;
  }

  @Override
  public void display() {
    String temperatureResult;
    String humidityResult;

    if (increaseTemperature) {
      temperatureResult = "Increasing temperature";
    } else {
      temperatureResult = "Decreasing temperature";
    }

    if (increaseHumidity) {
      humidityResult = "Incresing humidity";
    } else {
      humidityResult = "Decreasing humidity";
    }

    System.out.println(temperatureResult + ", " + humidityResult);
  }
}
