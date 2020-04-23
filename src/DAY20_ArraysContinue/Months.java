package DAY20_ArraysContinue;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        String [] months= {"Jan" ,"Feb", "Mar" , "Apr", "May", "Jun" , "Jul" , "Agu" , "Seb" , "Oct" , "Nov" , "Dec"}; // size= 12
               //            0     1   2

        int[] n = new int[3];
        n[0] = 0;
        n[1] =1 ;
        n[2] =2;
        //     n[3] = 3;

        /*
        String monhts2 = new String [12];
        monhts2[0]="Jan";
        ...
         */


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num= input.nextInt();
        int attempts=1;

        while (num>12 || num<=0) {
            System.out.println("invalid entry");
            System.out.println("Please re enter the number:");
            num=input.nextInt();
            attempts++;

            if (attempts==3 && (num>12 || num<=0)){
                System.out.println("Invalid entery , you have a 3 attemps");
                System.exit(0);
            }

        }
        String  result= months[num-1]; // index number , index number start from 0 ALWAYS
        System.out.println(result);


    }
}
