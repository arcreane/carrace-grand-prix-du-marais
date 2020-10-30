package com.company;

public class SlowCars extends Cars {


    public SlowCars() {
        percentageHappening = 10;
        speed = 13;
    }

    @Override
    public void manageEvent() {
        System.out.println("Je suis une voiture lente");
    }
}
