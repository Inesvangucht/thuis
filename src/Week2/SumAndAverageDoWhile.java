package Week2;

public class SumAndAverageDoWhile {
    public static void main(String[] args) {

        int low = 1;
        int high = 100;
        int number = low;
        int sum = 0;


        do {
            sum += low;
            number++;
            low++;

        } while (number<=high);




        double average = (double)sum/(double)high;

        System.out.println("The sum is " + sum + ".");
        System.out.println("The avarage is " + average  + ".");  //deze klopt niet

    }
}
