package Week2;

public class FacWiki {
    public static void main(String[] args) {
        long getal = 0;
        long uitkomst = getal;


        // 5 * 4 * 3 * 2 * 1


        if (getal == 0) {
            System.out.println("1");
        } else {

            do {
                getal--;
                uitkomst = uitkomst * getal;
            }

            while (getal > 1);


            System.out.println(uitkomst);

        }
    }
}
