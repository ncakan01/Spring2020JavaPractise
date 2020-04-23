package day09_NestedIf_Ternary;

public class NestedIf {
    public static void main(String[] args) {
        int age=17;
        boolean UScitezen=true;

        if (UScitezen){
            if (age>17){
                System.out.println("You are eligible to vote");
            }else{
                System.out.println("Grow up first , and then vote");
            }
        }else{
            System.out.println("Only the US citizens are eligible are eligible to vote for donald trump");
        }


        System.out.println("========================================================================================");

        int score =98;
        String grade="";

        if (score>=0 && score<=100){
            if(score>=90){
               grade="A";
            }else if(score>=80 ){
                grade ="B";
            }else if (score>=70){
                grade="C";
            } else if (score >= 60) {
                grade="D";
            }else {
                grade="F";
            }
        }else{
            grade="invalid";
        }
        System.out.println(grade);//b

        System.out.println("======================================================");

        int score2 = 200;
        String grade2 = "";

        if(score2>=0 && score2 <= 100){

            grade2 = (score2 >= 90 ) ? "A" :(score2>=80)? "B" :(score2 >= 70) ? "C" :(score2 >= 60) ? "D" : "F";

        }else{
            grade2 = "Invalid";
        }


        System.out.println(grade2); //Invalid


    }
}
