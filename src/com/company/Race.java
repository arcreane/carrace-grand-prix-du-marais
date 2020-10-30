package com.company;
//GAMELOOP

public class Race {
    Cars cars;

    public Race(Cars cars) {
        this.cars = cars;
    }
    public void displayInfos() {
        //System.out.println("Vroom, time elapsed : "+ time +"sec");
        //System.out.println("Distance travaled : "+ distance +"m");
        System.out.println("Speed : "+ cars.getSpeed() +"k/m");
        System.out.println("------------------------------------- :"+ cars.getSpeed() + " k/m");
    }

    public void GameLoop() {
        displayInfos();
        cars.manageEvent();
    }
}
