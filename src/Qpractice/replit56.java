package Qpractice;

import java.util.Scanner;

public class replit56 {
    public static void main(String[] args) {
        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0 ;
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE

        System.out.println("Select screen size:");
        double screensize =scan.nextDouble();
        if (screensize==13.3){
            price+=200;
        }else if(screensize==15.0){
            price+=300;
        }else if (screensize==17.3){
            price+=400;
        }
        System.out.println("Select CPU type:");
        cpu=scan.next();
        if (cpu.equalsIgnoreCase("i3")){
            price+=150;
        }else if (cpu.equalsIgnoreCase("i5")){
            price+=250;

        }else if (cpu.equalsIgnoreCase("i7")){
            price+=350;
        }
        System.out.println("Select RAM size:");
        ram=scan.nextInt();
        for(int i=4; i<=ram; i+=4){
            price+=50;
        }
        System.out.println("Select storage type:");
        storageType=scan.next();
        System.out.println("Enter memory size:");
        int memorysize=scan.nextInt();
        if (storageType.equalsIgnoreCase("HDD")){
            for (int j=0; j<memorysize; j+=500) {
                price += 50;
            }
        }else if (storageType.equalsIgnoreCase("SSD")){
            for (int j=0; j<=memorysize; j+=500){
                price+=100;
            }
        }
        System.out.println("Enter screen resolution:");
        screenType=scan.next();
        if (screenType.equalsIgnoreCase("FULLHD")){
            price+=100;
        }else if (screenType.equalsIgnoreCase("4K")){
            price+=200;
        }

        String result="Laptop price is: $"+price;
        System.out.println(result);





    }
}
