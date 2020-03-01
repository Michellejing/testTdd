package com.jiker.keju;

public class TimingPrice {
    private int time;

    public TimingPrice(int time) {
        // TODO Auto-generated constructor stub
        this.time = time;
    }

    public double calculateTimingPrice() {
        return 0.25 * time;
    }
}
