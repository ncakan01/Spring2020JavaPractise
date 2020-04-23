package day09_NestedIf_Ternary;

public class Ternary2 {

    public static void main(String[] args) {


        // ternary: ? means if , : else
        String result="";
        if (9>10) {
            result = "9 is gerater";
        }else{
            result="10 is gerater";

        }
        System.out.println(result);
        String result2=(9>10)?"9 is gerater":"10 is gerater";
        System.out.println(result2);

        System.out.println("============================================================================");

        int age =21;
        boolean eligibility=(age>=21)?true:false;
/*
        if (age>=21){
            eligibility=true;

        }else {
            eligibility=false;
        }

 */

        System.out.println(eligibility);
        boolean eligibility2=(age>=21)?true:false;
        System.out.println(eligibility2);
        System.out.println("==============================================================================");

        int ageOfPerson=20;

        String eligibilityToVote="";

        if (ageOfPerson>=18){
            eligibilityToVote = "yes";

        }else{
            eligibilityToVote="no";
        }

        System.out.println(eligibilityToVote);
        String eligibilityToVote2=(ageOfPerson>=18)?"yes":"no";
        System.out.println(eligibilityToVote2);















    }
}
