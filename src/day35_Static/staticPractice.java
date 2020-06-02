package day35_Static;

import java.util.Scanner;

public class staticPractice {

    // when to use static variable instead of instance


  static   Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
method1();
        //Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = scan.nextInt();    // burda error verdi cunku satatic metod only accept static vee yukarda  scannerin basina static ekledik
        System.out.println("Enter num2");
        int num2 = scan.nextInt();

        System.out.println("sum is: "+ (num1 + num2));
    }

    public static void  method1(){
       // Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = scan.nextInt();
        System.out.println("Enter num2");
        int num2 = scan.nextInt();

        System.out.println("Multilication: "+(num1 * num2));

    }

}
