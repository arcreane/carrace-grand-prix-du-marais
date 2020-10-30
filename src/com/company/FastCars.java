
package com.company;

public class FastCars extends Cars {

    public FastCars() {
        percentageHappening = 35;
        speed = 35;
    }

    @Override
    public void manageEvent() {
        System.out.println("Je suis une voiture rapide");
    }
}

