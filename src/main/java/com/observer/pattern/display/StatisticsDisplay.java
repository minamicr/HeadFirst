package com.observer.pattern.display;

import com.observer.pattern.WeatherData;
import com.observer.pattern.model.DisplayElement;
import com.observer.pattern.model.Observer;
import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Observer, DisplayElement {
  WeatherData subject;
  List<Float> temperatureHistory;
  List<Float> humidityHistory;
  Float mediumTemperature;
  Float mediumHumidity;

  public StatisticsDisplay(WeatherData subject){
    this.subject = subject;
    subject.registerObserver(this);
    temperatureHistory = new ArrayList<>();
    humidityHistory = new ArrayList<>();
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    temperatureHistory.add(temp);
    humidityHistory.add(humidity);

    display();

  }

  private double calculateMediumTemperature(){
    return temperatureHistory.stream()
        .mapToDouble(Float::doubleValue)
        .average()
        .orElse(0);
  }

  private double calculateMediumHumidity(){
    return humidityHistory.stream()
        .mapToDouble(Float::doubleValue)
        .average()
        .orElse(0);
  }

  @Override
  public void display() {
    System.out.println("Média de temperatura " + calculateMediumTemperature() + ", média de humidade " + calculateMediumHumidity());

  }
}
