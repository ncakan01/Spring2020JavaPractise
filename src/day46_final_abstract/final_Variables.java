package day46_final_abstract;

public class final_Variables {

    final int InstanceVariable = 300;
 // final int InstanceVariable ; // final instance variablae need to be initiazed  immedietly

    static int staticVariable = 1000;   // instance variablae need to be initiazed  immedietly

    public static  void main (String [] args){
        final double PI = 3.14; // constant
      // PI = 3.15;

        final String gender = "Male";
         //gender = "Female";


        final int score;
        score =100;
      // score = 200;

        System.out.println(score);


        System.out.println("===================================================================================");

       // this.InstanceVariable = 400;

        final_Variables obj = new final_Variables();
      //  obj.InstanceVariable = 400;

        staticVariable=2000;



    }
}
