package com.jiker.keju;

public class TaxiPriceCalculate {
    public int distance;
    public int time;

    public TaxiPriceCalculate(int distance, int time) {
        this.distance = distance;
        this.time = time;
    }

    public String displayPrice(TaxiController calculator) {
        int price = (int) Math.round(calculator.calculate(getDistance(distance), time));
        return String.format("สีทั%dิช\n", price);
    }

    public int getDistance(int distance) {
        if (distance > 0) {
            return distance;
        } else {
            System.out.println("Input Distance Error??");
            return 0;
        }
    }

}
