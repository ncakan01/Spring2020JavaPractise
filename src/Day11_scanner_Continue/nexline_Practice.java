package Day11_scanner_Continue;

import java.util.Scanner;

public class nexline_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age :");
        int age = input.nextInt(); // 30 +enter
        System.out.println("your age is : " + age);

        input.nextLine(); //enter

        System.out.println("Enter your full name :");
        String fullname=input.nextLine();
        System.out.println("Your full name is: " +fullname);
    }
}
