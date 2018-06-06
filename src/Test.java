import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Geef een getal tussen 0 en 1000");
        int getal = in.nextInt();

        int c1 = getal/1000;
        int c2 = c1/100;
        int c3 = c2/10;




        System.out.println(c1);

        }

    }


