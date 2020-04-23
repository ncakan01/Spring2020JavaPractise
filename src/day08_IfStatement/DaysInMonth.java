package day08_IfStatement;
/*
2. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
	 		byte month =  3
			28 days: 2
			30 days: 4,6,9,11
			31 days: 1,3,5,7,8,10,12
 */



public class DaysInMonth {
    public static void main(String[] args) {

        byte monht=3;

        boolean days28= monht==2;
        boolean days30= monht==4 || monht==6 || monht==9 || monht==11;
        boolean days31= days28==false && days30==false;

        //boolean days31_2=!days28 && !days30;

        if(days28){
            System.out.println("it has 28 days");
        }
        if(days30){
            System.out.println("it has 30 days");
        }
        if(days31){
            System.out.println("it has 31 days");
        }


    }
}
