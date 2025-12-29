package com.example.javadp.behavioral.observer.weatherApp;

import com.example.javadp.behavioral.observer.weatherApp.concreteobservers.PhoneDisplay;
import com.example.javadp.behavioral.observer.weatherApp.concreteobservers.TvDisplay;
import com.example.javadp.behavioral.observer.weatherApp.concreteobservers.interfaces.IObserver;
import com.example.javadp.behavioral.observer.weatherApp.concretesubjects.WeatherStation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/observer")
public class ObserveController {
    private WeatherStation weatherStation;

    @PostMapping("/registerWeatherStation")
    public String registerWeatherStation() {
        if (this.weatherStation == null) {
            this.weatherStation = new WeatherStation();
        } else {
            return "WeatherStation is already registered!";
        }
        return "WeatherStation registered successfully!";
    }

    @PostMapping("/registerObserver")
    public String registerObserver(@RequestParam String observerType) {
        if (this.weatherStation == null) {
            return "WeatherStation is not registered yet!";
        }

        IObserver observer;
        switch (observerType.toLowerCase()) {
            case "phone":
                observer = new PhoneDisplay();
                break;
            case "tv":
                observer = new TvDisplay();
                break;
            default:
                return "Invalid observer type!";
        }

        weatherStation.registerObserver(observer);
        return observerType + " observer registered successfully!";
    }

    @PostMapping("/updateWeather")
    public String updateWeather(@RequestParam String weatherData) {
        if (this.weatherStation == null) {
            return "WeatherStation is not registered yet!";
        }

        weatherStation.setWeatherData(weatherData);
        return "Weather updated to: " + weatherData;
    }
}