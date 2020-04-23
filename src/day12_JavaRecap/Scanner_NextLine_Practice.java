package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        // 7925 JonesBranch Dr, McLean VA, 22034
        // fullAddress: Building-number  Street, city, state zipcode

        System.out.println("Bild  number :");
        int bNumber=input.nextInt();

        input.nextLine();  // used for taking out the Enter from scanner

        System.out.println("Street:");
        String street=input.nextLine();

        System.out.println("Enter the zip code");
        int zipCode=input.nextInt();

        input.nextLine(); // take out enter

        System.out.println("enter the city name and state by comma and space");
        String cityState=input.nextLine();
        String fullAdress= bNumber+" "+street+", "+cityState+" "+ zipCode;
        System.out.println(fullAdress);


        input.close(); // close scanner


    }
}
