package Week2;

public class SumAndAverage {
    public static void main(String[] args) {

        // oefening op loop

        // som van 1 tot honderd plus gemiddelde. ziet eruit als
        // The sum is 5050
        // The average is 50.5

        int sum = 0;
        int low = 1;
        int high = 100;

        for (int number = low; number <= high; number++) {

            sum += number; // je kan ook zeggen sum = sum + number

        }

        double average = ((double)sum / high);

        System.out.println("The sum is " + sum + ".");
        System.out.println("The avarage is " + average + ".");



    }
}
