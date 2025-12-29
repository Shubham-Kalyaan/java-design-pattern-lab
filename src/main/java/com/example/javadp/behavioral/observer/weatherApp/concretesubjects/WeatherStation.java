package com.example.javadp.behavioral.observer.weatherApp.concretesubjects;

import com.example.javadp.behavioral.observer.weatherApp.concreteobservers.interfaces.IObserver;
import com.example.javadp.behavioral.observer.weatherApp.concretesubjects.interfaces.ISubject;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements ISubject {
    private final List<IObserver> observers = new ArrayList<>();
    private String weatherData;

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (IObserver observer : observers) {
            observer.update(message);
        }
    }

    public void setWeatherData(String weatherData) {
        this.weatherData = weatherData;
        notifyObservers(weatherData);
    }
}
