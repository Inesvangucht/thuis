package Week2;

import java.util.Scanner;

public class CheckPassFail {
    public static void main(String[] args) {

        System.out.println("Geef een getal in.");

        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();

        if (mark >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FALSE");
        }
        System.out.println("DONE");
    }
}
