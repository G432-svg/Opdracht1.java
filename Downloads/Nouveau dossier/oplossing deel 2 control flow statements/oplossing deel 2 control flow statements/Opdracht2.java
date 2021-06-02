package be.intecbrussel.exercises.controlflowstatements2;

import java.util.Scanner;

public class Opdracht2 {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        int month;

        do {
            System.out.println("Geef de maand van het jaar in [1-12]");
            month = kbd.nextInt();

            switch (month) {
                case 3:
                case 4:
                case 5:
                    System.out.println("Het is lente");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Het is zomer");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Het is herfst");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println("Het is winter");
                    break;
                default:
                    System.out.println("Verkeerde input!\n");
            }

        }while (month < 1 || month > 12);

        kbd.close();

    }

}
