package day13_StringClass;
    /*
        input : cyBerTek sChool
        output:
        Cybertek
        School

         */


import java.util.Scanner;

public class StringManipulations_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String  fullName = input.nextLine(); // cybertek school

        String firstName= fullName.substring(0 , fullName.indexOf(" "));
        String lastName=fullName.substring(fullName.indexOf(" " ) +1);

        firstName =firstName.substring(0,1).toUpperCase()+   firstName.substring(1).toLowerCase();
        lastName=lastName.substring(0,1).toUpperCase()+   lastName.substring(1).toLowerCase();

        System.out.println("Your First name is: " + firstName);
        System.out.println("Your last name is " + lastName);





    }
}
