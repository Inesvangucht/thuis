package Week1;

import java.text.DecimalFormat;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        System.out.println(" ");
        System.out.println(" ---- ");
        System.out.println(" ");

        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Pogramming is fun");

        System.out.println(" ");
        System.out.println(" ---- ");
        System.out.println(" ");

        System.out.println("   J    A V     V A");
        System.out.println("   J   A A V   V A A");
        System.out.println("J  J  AAAAA V V AAAAA");
        System.out.println(" J J A     A V A     A");

        System.out.println(" ");
        System.out.println(" ---- ");
        System.out.println(" ");

        System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9");

        System.out.println(" ");
        System.out.println(" ---- ");
        System.out.println(" ");

        DecimalFormat df = new DecimalFormat("##.##");

        double distance = 14;
        double minutes = 45;
        double seconds = 30;
        double time = minutes*60 + seconds;
        double kmHour = distance/time*6000;
        double miles = distance / 1.6;
        double mileHour = miles/time*6000;
        System.out.println("Your average speed is " + df.format(mileHour) + " miles per hour.");



    }
}
