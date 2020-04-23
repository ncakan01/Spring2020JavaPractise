package day14_StringClass;

import java.util.Scanner;

public class StartEndWords {
    /*
    2. Write a program StartEndWords:
	you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
		if either one not 5 chars length:    print "need to be exactly 5 chars length"
		if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
		if they do not match:  print "Buzz - did not match"

		pre condition both words must be 5 charactes
     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter first word :");
        String word1=input.next();

        System.out.println("Enter second word:");
        String word2=input.next();

        int lenght1=word1.length();
        int lenght2=word2.length();

        if (lenght1==5 && lenght2==5){

            if (word1.charAt( lenght2-1 )== word2.charAt(0)){
                // last char in fist word == fist char in second word
                System.out.println("fizz");
            }else {
                System.out.println("buzz");
            }

        }else{
            System.out.println("need to be exactly 5 chars length");
        }


    }
}
