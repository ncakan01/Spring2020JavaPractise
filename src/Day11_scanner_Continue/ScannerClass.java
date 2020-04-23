package Day11_scanner_Continue;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println((long) 2.5);


        System.out.println("Enter a long number : ");
        long a =input.nextLong();
        System.out.println("you have entered :" +a);

        System.out.println("Enter a demical");
        long b = (long)input.nextFloat();   //float can be assigned to be double
        System.out.println();
        System.out.println("You have entered :" +b);


        System.out.println("Enter a decimal number");
        double f = input.nextDouble();
        System.out.println("You have entered :" +f);

        System.out.println("Enter true or false");
        boolean bool = input.nextBoolean();
        System.out.println(bool);

        System.out.println("Enter your sentece :");
        String str =input.next();
        System.out.println("You entered :" + str);




    }
}
