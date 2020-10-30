package com.company;

import java.util.Scanner;

public class ScannerColor {
    public ScannerColor() {
        Scanner keyInputByUser = new Scanner(System.in);
        String colorUser = keyInputByUser.nextLine();
        System.out.println("Vous avez selectionner la couleur " + colorUser);
    }
}
