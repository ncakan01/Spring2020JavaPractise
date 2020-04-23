package DAY20_ArraysContinue;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        String[]days ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number");
        int num =input.nextInt();
        int attemps=1;

        while (num<7 || num>1){
            System.out.println("Invalis entry , pelasecrev enter the number");
            num=input.nextInt();
            attemps++;

            if (attemps==3 &&( num<7 || num>1));
            System.out.println("Invalid entery , you have a 3 attemps");
            System.exit(0);

        }
        String result=days[num-1];
        System.out.println(result);
    }
}
