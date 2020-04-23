package Qpractice;

import java.util.Scanner;

public class replit65 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int length = word.length();
        if (length % 2 == 1 && length >= 5) {
            System.out.println(word.substring(length / 2 - 1, length / 2 + 2));

        } else {
            System.out.println("invalid");
        }

        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE

        int len1 = word1.length();
        int len2 = word2.length();

        if (word1.length() == 3 && word2.length() == 3) {
            System.out.println("" + word1.charAt(0) + word2.charAt(0) + word1.charAt(1) + word2.charAt(1)
                    + word1.charAt(2) + word2.charAt(2));

        } else {
            System.out.println("cannot merge");
        }

    }
}
