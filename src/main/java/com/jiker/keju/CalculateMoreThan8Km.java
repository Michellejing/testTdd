package com.jiker.keju;

public class CalculateMoreThan8Km implements CalculateStrategy {
    int distance;
    int time;

    public CalculateMoreThan8Km(int distance, int time) {
        this.distance = distance;
        this.time = time;
    }

    @Override
    public double calculate() {
        // TODO Auto-generated method stub
        double price;
        CalculateWithin8Km calculateWithin8Km = new CalculateWithin8Km(distance, time);
        price = 0.4 * (distance - 8) + calculateWithin8Km.calculate();
        return price;
    }

}
