package Week2;





public class GuessingGame {

    public static void main(String[] args) {
        int r = GuessingGame.berekenRandomGetal(6, 8);
        System.out.println(r);

        boolean b = GuessingGame.isPriem(r);

        if (b) {
            System.out.println("wel");
        } else {
            System.out.println("niet");
        }

    }

    public static int berekenRandomGetal(int min, int max) {
        int rand = (int) (min + (max - min + 1) * Math.random());
        return rand;




       // System.out.println(InesRandom.berekenRandomGetal(rand));
    }


    /**
     * Cqlcuqlts q prime number ....
     * @param getal
     * @return True if input is pri;e
     */
    public static boolean isPriem(int getal) {
        int kandidaat = 2;
        boolean isPrime = true;


        while (kandidaat < getal)  {
            int rest = getal % kandidaat;

            if (rest==0) {
                isPrime = false;

            }
            kandidaat++;
        }

        return isPrime;
    }
}

