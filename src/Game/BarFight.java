package Game;

import java.util.Scanner;

public class BarFight {

    public static void main(String[] args) {

        Drunk willy = new Drunk("Willy");
        Drunk billy = new Drunk("Billy");

        while (!billy.knockedOut() && !willy.knockedOut() && !willy.passedOut() && !billy.passedOut()) {

            System.out.println("\nGive command.");
            System.out.println("1. Drink    2. Throw Bottle   3. Punch");
            Scanner sc = new Scanner(System.in);
            int command = sc.nextInt();

            if (command == 1) {
                willy.drinkBeer();
                willy.checkDrunk();

            } else if (command == 2) {
                willy.throwBottle(billy);

            } else if (command == 3) {
                willy.punch(billy);


            } else {
                System.out.println("Sober up, this is not a valid command.");
            }

            billy.punch(willy);


        }

        if (billy.knockedOut()) {
            System.out.println("Billy is KO. Willy won the bar fight. He should be very proud of himself.");
        }

         else if (willy.knockedOut()) {
            System.out.println("Willy is KO. Billy won the bar fight. He should be very proud of himself.");
            }


        else if (willy.passedOut()) {
            System.out.println("Willy had one to many. He passed out on the floor. Kinda sad. Billy won!");
        }
        else if (billy.passedOut()) {
            System.out.println("Billy had one to many. He passed out on the floor. Kinda sad. Willy won!");
        }



    }

}
