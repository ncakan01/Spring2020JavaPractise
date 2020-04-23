package day18Nested_loop;

import java.util.Scanner;

public class NestedLoop_Practice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter two number:");
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            System.out.println("Addition of two numbers : " + (num1 + num2));
            System.out.println("Do you want to continue");
            String answer = input.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("invslid entry , please re enter yes or no" );
                answer = input.next();

                if (answer.equalsIgnoreCase("no")) {
                    System.out.println("Thank you using the calculator");
                    break;
                }

            }

        }


    }
}