package day44_Exception;

public class ExceptionHandling {

    public static void main(String[] args) {
        String str = "Cybertek";
        try {
            System.out.println(str.charAt(100));
        }catch (RuntimeException e){
          String discription = e.getMessage();

            System.out.println(discription);
        }

        System.out.println("=============================================================");


        try {
            System.out.println(100/0);
            System.out.println("try block");
        }catch (ArithmeticException e){

       String discription =    e.getMessage();
            System.out.println("catch block");
            System.out.println(discription);
        }

        System.out.println("Completed");
        /*
        test case:

              step1
              step2
              step3
              step4
              ......

              step10
         */

    }
}
