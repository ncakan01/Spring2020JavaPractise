package day21_MultiDimensionalArrays;
/*
Task:
    given an array:
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"}
        elemnts could be more in the array
    prin all the email addresses excluding the gmail addresses
        NOTE: MUST USE FOR EACH LOOP
 */

public class Emails {
    public static void main(String[] args) {
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"}; // 10

        for (String EachEmail : emails){
            if (EachEmail.contains("@gmail.com")){
                System.out.println(EachEmail);
                continue;
            }

            /*
            if (!EachEmail.endsWith("@gmail.com")){
                System.out.println(EachEmail);
            }

             */
        }


    }
}
