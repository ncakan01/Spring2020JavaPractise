package day15_ForLoop;

import java.util.Scanner;

public class Initials {
    /*
    warmup tasks:
            1. write a program that asks user's first and last name, then prints out the initials of the user
    Ex:
    input:
    cybertek
            batch12
    output:your initial is: CB

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstname=scan.next();

        System.out.println(" Enter your last name:");
        String lastname=scan.next();

       // String initials2 = firstName.substring(0).toUpperCase() +  lastName.substring(0,1).toUpperCase();
        //    initials = initials.toUpperCase();

        String initials=""+firstname.charAt(0)+lastname.charAt(0); // returns string

        initials=initials.toUpperCase();

        System.out.println(initials);



    }


}
