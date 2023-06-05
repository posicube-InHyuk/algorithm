package com.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

// 주제(Subject) 인터페이스
interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// 주제(Subject) 구현 클래스
class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}

// 옵저버(Observer) 인터페이스
interface Observer {
    void update(float temperature);
}

// 옵저버(Observer) 구현 클래스
class Display implements Observer {
    private float temperature;

    public void update(float temperature) {
        this.temperature = temperature;
        displayTemperature();
    }

    public void displayTemperature() {
        System.out.println("현재 온도: " + temperature + "도");
    }
}

// 메인 클래스
public class ObserverPatternExample {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Display display1 = new Display();
        Display display2 = new Display();

        weatherData.registerObserver(display1);
        weatherData.registerObserver(display2);

        weatherData.setTemperature(25.5f);
        // 출력 예시: "현재 온도: 25.5도"

        weatherData.setTemperature(30.0f);
        // 출력 예시: "현재 온도: 30.0도"

        weatherData.removeObserver(display1);

        weatherData.setTemperature(27.8f);
        // 출력 예시: "현재 온도: 27.8도" (display1은 알림을 받지 않음)
    }
}
