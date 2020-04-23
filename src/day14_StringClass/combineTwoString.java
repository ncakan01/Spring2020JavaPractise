package day14_StringClass;
/*2. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
        Input:
        apple
        banana
        Output:
        ppleanana

 */

import java.util.Scanner;

public class combineTwoString {
    /*
 2. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First word :" );
        String word1 =input.next(); // Apple
        word1= word1.substring(1); //pple

        System.out.println("Enter second word :" );
        String word2 =input.next(); // banana
        word2= word2.substring(1); //anana

        String result=word1+word1;

        System.out.println(result);


    }
}
