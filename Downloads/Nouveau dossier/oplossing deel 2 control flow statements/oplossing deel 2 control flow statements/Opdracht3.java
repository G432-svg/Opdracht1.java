package be.intecbrussel.exercises.controlflowstatements2;

public class Opdracht3 {

    public static void main(String[] args) {

        int x = 10;

        while (x >= 0) {
            System.out.println("x = " + x);
            System.out.println("x = " + ++x);
            x -= 3;
        }

    }

}
