package Week2;

public class Prime {
    public static void main(String[] args) {
        //* met if en while


        int getal = 8;  //is dit een priemgetal?



        int kandidaat = 2;
        boolean isPrime = true;


        while (kandidaat < getal)  {
            int rest = getal % kandidaat;

            if (rest==0) {
                isPrime = false;

            }
            kandidaat++;
        }


        // post outout displqy
        if (isPrime) {
            System.out.println("niet");
        }

        else    {
            System.out.println("wel");
        }

    }
}
