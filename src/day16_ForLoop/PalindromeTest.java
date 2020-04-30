package day16_ForLoop;

import java.util.Scanner;

public class PalindromeTest {

    public static void main(String[] args) {

        Scanner  input = new Scanner(System.in);
        System.out.println("Enter your word :");
        String word = input.next(); // Java
                                     //0123
        String reverseWord ="";
        for (int i=word.length()-1; i>=0 ; i--){
            reverseWord+=word.charAt(i);
        }
        boolean palindrome=word.equals(reverseWord);

        System.out.println(palindrome);


    }

}
