package be.intecbrussel.exercises.controlflowstatements2;

import java.util.Scanner;

public class Opdracht5 {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.println("Vul getal 1 in: ");
        double getal1 = kbd.nextDouble();

        System.out.println("Vul getal 2 in: ");
        double getal2 = kbd.nextDouble();

        System.out.println("Maak een keuze\n");
        System.out.println("1. optelling\n2. aftrekking\n3. deling\n4. vermenigvuldiging");

        int keuze = kbd.nextInt();

        while (keuze < 1 || keuze > 4) {

            System.out.println("Foutief getal, gelieve een getal van 1 tot 4 in te geven");
            keuze = kbd.nextInt();
        }

        switch (keuze) {
            case 1:
                System.out.println(getal1 + " + " + getal2 + " = " + (getal1 + getal2));
                break;
            case 2:
                System.out.println(getal1 + " - " + getal2 + " = " + (getal1 - getal2));
                break;
            case 3:
                if (getal2 == 0) {
                    System.out.println("Kan niet delen door 0");
                }else  {
                    System.out.println(getal1 + " / " + getal2 + " = " + (getal1 / getal2));
                }
                break;
            case 4:
                System.out.println(getal1 + " * " + getal2 + " = " + (getal1 * getal2));
                break;
        }

        kbd.close();

    }

}
