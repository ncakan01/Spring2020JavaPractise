package Day11_scanner_Continue;
/*
Task: Scanner_Practice1
    1. ask the user enter first name
    2. ask user to enter last name
    3. ask the user employeed or not? true ==> employeed, false ==> unemployeed
    4. if he is employeed , ask the salary
    4. if he is not employeed set the salary to 0
    output:
        full name:
        employeeed status:
        salary:
 */

import java.util.Scanner;

public class ScannerPractice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your fist name :");
        String firstname=input.next();

        System.out.println("Enter your last name :");
        String lastname=input.next();

        String fullname=firstname+" "+lastname;

        System.out.println("Are you employeed ?");
        boolean employeedstatus=input.nextBoolean();

        double salary=0;

        if (employeedstatus ==true){
            System.out.println("Enter your salary");
            salary=input.nextDouble();
        }
        System.out.println("Full name is : " +fullname);
        System.out.println("Employeed :" +employeedstatus);
        System.out.println("Salary : $" + salary);
    }
}
