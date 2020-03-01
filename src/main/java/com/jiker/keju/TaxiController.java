package com.jiker.keju;

public class TaxiController {
    CalculateStrategy calculateStrategy;

    public double calculate(int distance, int time) {
        if (distance <= 2) {
            calculateStrategy = new CalculateWithin2Km(distance, time);
        } else if (distance > 2 && distance <= 8) {
            calculateStrategy = new CalculateWithin8Km(distance, time);
        } else {
            calculateStrategy = new CalculateMoreThan8Km(distance, time);
        }
        return calculateStrategy.calculate();
    }

}
