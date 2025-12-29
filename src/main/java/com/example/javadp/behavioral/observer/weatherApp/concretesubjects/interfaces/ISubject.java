package com.example.javadp.behavioral.observer.weatherApp.concretesubjects.interfaces;

import com.example.javadp.behavioral.observer.weatherApp.concreteobservers.interfaces.IObserver;

public interface ISubject {
    void registerObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers(String message);
}
