package Day11_scanner_Continue;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the full name :" );
        String fullname=input.nextLine();
        System.out.println("Tour full name is :" +fullname);

        System.out.println("Enter your sentence :");
        String sentence=input.next();

        System.out.println("Sentence : " +sentence);

    }
}
