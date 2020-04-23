package DAY24_Metods;

import java.util.Scanner;

public class BirthYear {


    public static void Age(int birthyear){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the current year :");
        int currentYear=scan.nextInt();


        int age =currentYear -birthyear;
        if (age>0 && birthyear>1900){
            System.out.println(age);

        }else{
            System.out.println("invalid birth year");
        }


    }

    public static void main(String[] args) {
        //int a =1993;
        //Age(a);
        //Age((short)2002);

        Age(2000);

        printHelloCybertek();

    }

    public static void printHello(){
        System.out.println("Hello");
    }
    public static void printCybertek() {
        System.out.print("Cybertek");
    }

    public static void printHelloCybertek(){
        printHello();  // Hello
        printCybertek(); // Cybertek
    }


}
