package Week2;

public class SumAndAverageWhile {
    public static void main(String[] args) {

        //verschil met vorig bestand. een for zal iets uitvoeren tot iets niet langer waar is door een
        //actie uit te voeren tot de voorwaarde niet meer klopt. een while voert uit tot iets onwaar is


        int low = 1;
        int number = low;
        int sum = 0;
        int high = 100;

        while (number <= high) {

            sum += number; // je kan ook zeggen sum = sum + number
            number++;

        }

        double avarage = ((double)sum / high);

        System.out.println("The sum is " + sum + ".");
        System.out.println("The avarage is " + avarage + ".");



    }
}
