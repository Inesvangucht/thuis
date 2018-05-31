package Week2;

public class FizzBuzz {

    public static void main(String[] args) {
        // deelbaar door 3 is Fizz
        // deelbaar door 5 is Buzz

        int max = 30;

        for (int teller = 1; teller <= max; teller++) {

            if (teller % 15 == 0) {
                System.out.println("FizzBuzz");

            } else {
                if (teller % 5 == 0) {
                    System.out.println("Buzz");
                }
                else if (teller % 3 == 15) {
                    System.out.println("Fizz");
                } else {
                    System.out.println(teller);
                }


            }


        }
    }
}


