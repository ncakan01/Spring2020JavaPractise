package Qpractice;

import java.util.Scanner;

public class replit91 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count=0;

        while (str.contains("hi")){
            count++;
            str=str.replaceFirst("hi","");   // az once ekledimiz kaldir.

        }
        System.out.println(count);



    }
}
