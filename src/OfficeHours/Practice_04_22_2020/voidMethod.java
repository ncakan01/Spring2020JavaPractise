package OfficeHours.Practice_04_22_2020;

public class voidMethod {
    public static void main(String[] args) {

        System.out.println("method");
        System.out.println("method");
        System.out.println("method");
        System.out.println("method");
        System.out.println("method");

        System.out.println("=========================================================");

        print();

        System.out.println("===========================================================");

        boolean UScitizen= true;
        int age =21;

        Vote(age,UScitizen);
    }
    public static void print (){
        System.out.println("method");
        System.out.println("method");
        System.out.println("method");
        System.out.println("method");
        System.out.println("method");
    }


    //

    public static void Vote(int age , boolean UScitizen){

        boolean eligibleToVote = age>=18 && UScitizen==true;

        if (eligibleToVote){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote yet");
        }

    }

    // write a method if a person is eligle to bu cig
    // MUST know: age

    public static void EligibleToBuCig(int age){
        if(age > 18){
            System.out.println("Eligible to but");
        }else{
            System.out.println("Not eligible to buy");
        }

    }


}
