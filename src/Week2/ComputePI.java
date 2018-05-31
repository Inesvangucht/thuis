package Week2;

public class ComputePI {

    public static void main(String[] args) {

        // Pi = 4 * (1/1 + 1/2 + 1/5 + 1/6)

        double start = System.nanoTime();
        int limit = 100000000;
        double som = 0;
        int teken = 1;

        for (int i = 1; i <= limit; i +=2) {
            double term = ((double)1/i)*teken;
           /* System.out.println(term); */
            teken *= -1;
            som += term;

            }


        double pi = 4 * som;
        double end = System.nanoTime();

        System.out.println("Pi is " + pi + ".");
        System.out.println("Total time taken: " + (end-(start) / 1e9));

    }

}
