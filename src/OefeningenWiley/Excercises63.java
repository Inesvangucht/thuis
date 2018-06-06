package OefeningenWiley;

public class Excercises63 {

    public static void main(String[] args) {

        System.out.println("+----+");
        System.out.println("|Inés|");
        System.out.println("+----+");

        System.out.println("\n");

        System.out.println("*****  *   *  *****   ***  ");
        System.out.println("  *    **  *  *      *     ");
        System.out.println("  *    * * *  *****   ***  ");
        System.out.println("  *    *  **  *          * ");
        System.out.println("*****  *   *  *****  ****  ");


        System.out.println("\n");

        System.out.println("  /////  ");
        System.out.println(" | º º | ");
        System.out.println("(|  ^  |)");
        System.out.println(" | [_] | ");
        System.out.println("  -----  ");

        System.out.println("\n");

        /**
         * Sum 1 to 10.
         */

        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);
        int min = 1;
        int max = 10;
        int som = 0;
        for (int teller = min; teller <= max; teller++) {
            som = som + min;
            min++;
        }
        System.out.println("de som is " + som);

        int low = 1;
        int high = 10;
        int sum = 0;


        while (low <= high) {
            sum = sum + low;
            low++;
        }
        System.out.println("de som is " + sum);

        System.out.println("\n");


    }

}
