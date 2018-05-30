public class Fibonacci {
    public static void main(String[] args) {
        /* 0 1 1 2 3 5 8 13 ... */

        int x = 0;
        int y = 1;
        int aantal = 8;

        for (int teller = 1; teller <= 8; teller++)

        {
            int sum = x + y;
            System.out.println(sum);
            x = y;
            y = sum;
        }


        int n = 6;
        int a = 0;
        int b = 1;

        System.out.println(a);
        System.out.println(b);
        for (int i = 1; i <= n; i++) {
            int som = a + b;
            System.out.println(som);
            a = b;
            b = som;
        }


    }


}
