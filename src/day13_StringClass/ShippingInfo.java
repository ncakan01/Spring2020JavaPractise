package day13_StringClass;

import java.util.Scanner;

/*
3. write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
 */
public class ShippingInfo {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in); //enter
        System.out.println("Enter your building number");
        String buildingNum=input.next(); // 112A enter

        input.nextLine();//enter

        System.out.println("Enter your street adress");
        String streetAddress=input.nextLine();

        System.out.println("Enter your city name");
        String cityName=input.nextLine();

        System.out.println("Enter your state");
        String stateName=input.nextLine();

        System.out.println("Enter your zipcode");
        String zipCode=input.next();

        input.nextLine();//enter

        System.out.println("Enter your full name");
        String fullname=input.nextLine();

        String result="Ship To: "+fullname+"\n"+buildingNum+" "+streetAddress+"\n"+cityName+", "+stateName+" "+zipCode;







    }
}
