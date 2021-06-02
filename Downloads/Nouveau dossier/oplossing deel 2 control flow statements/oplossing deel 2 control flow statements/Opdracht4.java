package be.intecbrussel.exercises.controlflowstatements2;

public class Opdracht4 {

    public static void main(String[] args) {

        // Maak een programma dat de getallen van 1 tot 100 afdrukt
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        // Maak een programma dat de getallen van 100 tot 1 afdrukt
        for (int i = 100; i > 0; i--) {
            System.out.println(i);
        }

        // Maak een programma dat alle even getallen van 1 tot 10000 afdrukt
        for (int i = 0; i <= 10_000; i += 2) {
            System.out.println(i);
        }

        for(int i = 1; i <= 10_000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Schrijf een programma dat de machten van 2 afprint tot en met 1024
        for (int i = 2; i < 1025; i *= 2) {
            System.out.println(i);
        }

    }

}
