package Week2;

import java.util.Scanner;

public class NumberGuess {

    // random nummer tussen 0 en 10, de user heeft drie kansen om het te raden
    public static void main(String[] args) {

        // programma bepaalt random nummer.


        int nummer = GuessingGame.berekenRandomGetal(0, 10);

        //System.out.println(nummer);


        System.out.println("Geef een getal tussen 0 en 10.");

        Scanner g1 = new Scanner(System.in);
        int guess1 = g1.nextInt();

        // aftoetsen met nummer

        if (guess1 == nummer) {
            System.out.println("Proficiat!");
        } else {

            System.out.println("Probeer nog eens!");

            Scanner g2 = new Scanner(System.in);
            int guess2 = g2.nextInt();

            if (guess2 == nummer) {
                System.out.println("Juist!");
            } else {
                System.out.println("Laatste kans!");
                Scanner g3 = new Scanner(System.in);
                int guess3 = g3.nextInt();
                if (guess3 == nummer) {

                    System.out.println("Klopt!!");

                } else {
                    System.out.println("GAME OVER!! Het getal was " + nummer + ".");
                }
            }

        }

    }
}