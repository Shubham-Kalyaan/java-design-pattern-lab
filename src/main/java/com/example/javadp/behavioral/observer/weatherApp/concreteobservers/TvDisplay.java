package com.example.javadp.behavioral.observer.weatherApp.concreteobservers;

import com.example.javadp.behavioral.observer.weatherApp.concreteobservers.interfaces.IObserver;

public class TvDisplay implements IObserver {
    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        displayWeather();
    }

    private void displayWeather() {
        System.out.println("Current weather on TV Display: " + weather);
    }
}
