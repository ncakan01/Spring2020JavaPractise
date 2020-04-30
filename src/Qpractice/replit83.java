package Qpractice;

import java.util.Scanner;

public class replit83 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        // your code
        // ------------------------------------------
        System.out.println("Please enter guest name:");
        String guestname = input.nextLine();
        System.out.println("Do you want to enter new guest name:");
        String anwers = input.nextLine();
        String toplam = "";
        int count = 0;
        while (anwers.equalsIgnoreCase("yes")) {
            System.out.println("Please enter guest name:");
            guestname = input.nextLine();
            toplam += guestname + ",";



            if (anwers.equalsIgnoreCase("no")) {
                System.out.println(toplam);
                break;

            }

        }
    }
}