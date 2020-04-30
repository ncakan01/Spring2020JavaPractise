package Qpractice;

import java.util.Scanner;

public class replit154 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);

    }

        public static void isPalindrome( int num){

            String str = num + "";  // int string cevrildi

            String reversedStr = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                reversedStr += str.charAt(i);

            }
            boolean result = (reversedStr.equalsIgnoreCase(str));
            System.out.println(result);

        }

    }