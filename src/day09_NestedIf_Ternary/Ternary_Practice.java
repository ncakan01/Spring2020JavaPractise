package day09_NestedIf_Ternary;

public class Ternary_Practice {
    public static void main(String[] args) {
        int number=100;

        char ch1=' ';

        if (number>0){
            ch1='+';
        }else if(number<0){
            ch1='-';
        }else{
            ch1='0';
        }
        System.out.println(ch1);
        char ch2 =(number>0)?'+':(number<0)? '-':'0';
        System.out.println(ch2);
       // System.out.println(ch1 + ch2);
        System.out.println("=================================================================================================");

        byte score=90;

        String grade;

        if (score>=90 && score<=100) {
            grade = "exellent";
        }else if (score>=80 && score<90) {
            grade = "great";
        }else if (score>=70 && score<80) {
            grade = "good";
        }else if (score>=60 && score<70) {
            grade = "pass";
        }else if (score<60 && score>0) {
            grade = "failed";
        }else{
            grade="invalid";
        }
        System.out.println(grade);


        String grade2=(score>=90 && score<=100)?"exellent": (score>=80 && score<90)?"great":(score>=70 && score<80)?"good":(score>=60 && score<70)?
                "pass":(score<60 && score>0)?"failed":"invalid";
        System.out.println(grade2);

        System.out.println("================================================================");

        int num =1000;

        if(num %2 ==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }

        //   (num %2 ==0) ? System.out.println("Even number") : System.out.println("Odd number");

        // we can only apply ternary: if the if statement' body is only returning value and assigning it to variable then we can apply ternary


    }
}
