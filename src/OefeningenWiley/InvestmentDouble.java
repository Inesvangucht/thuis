package OefeningenWiley;

public class InvestmentDouble {

    /**
     * € 10,000 aan 5%
     * Hoeveel jaar duurt het om je investering te verdubbelen.
     */

    public static void main(String[] args) {

        double kapitaal = 10000;
        double doel = kapitaal * 2;
        int jaar;

        for (jaar = 1; kapitaal <= doel; jaar++ ) {
            kapitaal = kapitaal * 1.05;
            System.out.print(jaar + ": ");
            System.out.println(kapitaal);
        }

    }

}
