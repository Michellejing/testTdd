package com.jiker.keju;

public class CalculateWithin8Km implements CalculateStrategy {
    int distance;
    int time;

    public CalculateWithin8Km(int distance, int time) {
        this.distance = distance;
        this.time = time;
    }

    @Override
    public double calculate() {
        double price;
        CalculateWithin2Km calculateWithin2Km = new CalculateWithin2Km(distance, time);
        price = 0.8 * (distance - 2) + calculateWithin2Km.calculate();
        return price;
    }

}
