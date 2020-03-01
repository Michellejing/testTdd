package com.jiker.keju;

public class CalculateWithin2Km implements CalculateStrategy {
    int distance;
    int time;

    public CalculateWithin2Km(int distance, int time) {
        this.distance = distance;
        this.time = time;
    }

    @Override
    public double calculate() {
        // TODO Auto-generated method stub
        double price;
        TimingPrice timingPrice = new TimingPrice(this.time);
        price = 6 + timingPrice.calculateTimingPrice();
        return price;
    }

}
