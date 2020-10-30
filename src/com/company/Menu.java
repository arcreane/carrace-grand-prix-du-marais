package com.company;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

import java.util.Scanner;

public class Menu {

    public Menu() {
        AnsiConsole.systemInstall();
        boolean userIsOnMenu = true;
        while (userIsOnMenu) {
            System.out.println("*********************************************************");
            System.out.println("*                                                       *");
            System.out.println("*            Welcome to Grand Prix Du Marais            *");
            System.out.println("*                                                       *");
            System.out.println("*********************************************************");
            System.out.println("\nPlease select the your car");
            System.out.println("\t- Type 1 for a speeding car / 35%");
            System.out.println("\t- Type 2 for a slow car / 60%");
            System.out.println("\t- Type 3 for EXIT");


            //SCAN FOR USE MAIN MENU
            Scanner keyInputByUser = new Scanner(System.in);
            String keyResultInputUser = keyInputByUser.nextLine();
            System.out.println(keyResultInputUser);


            //CHECK USER INPUT
            if (keyResultInputUser.equals("1") || keyResultInputUser.equals("2") || keyResultInputUser.equals("3")) {
                if (keyResultInputUser.equals("1")) {
                    Color color = new Color();
                    ScannerColor scannerColor = new ScannerColor();
                    Cars slowCars = new SlowCars();
                    userIsOnMenu = false;

                } else if (keyResultInputUser.equals("2")) {
                    Color color = new Color();
                    ScannerColor scannerColor = new ScannerColor();
                    Cars fastCar = new FastCars();
                    userIsOnMenu = false;

                } else if (keyResultInputUser.equals("3")) {
                    System.out.println(Ansi.Color.GREEN + "Vous avez quitté l'application.");
                    userIsOnMenu = false;

                }
            } else {
                //CHECK USER INPUT ;)
                System.out.println(Ansi.Color.RED + "Vous devez entrer une des propositions demandées");
            }
        }
    }

}




