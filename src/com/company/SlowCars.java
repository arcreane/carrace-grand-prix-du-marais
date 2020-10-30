package com.company;

public class SlowCars extends Cars {

    public SlowCars() {

    }

    @Override
    public void manageEvent() {
        System.out.println("Je suis une voiture lente");
    }
}
