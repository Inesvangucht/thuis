package Week2;

public class Faculteit {
    public static void main(String[] args) {
        /** bereken faculteit: bijvoorbeeld: "5! = 5*4*3*2*1 = 120" Input voorbeeld: "5", output "120"
         */

        long getal = 5;
        long uitkomst = getal;


        // 5 * 4 * 3 * 2 * 1


        do {
            getal--;
            uitkomst = uitkomst * getal;
        }

        while (getal > 1);


        System.out.println(uitkomst);

    }
}
