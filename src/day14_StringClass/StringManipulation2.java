package day14_StringClass;

public class StringManipulation2 {
    public static void main(String[] args) {
        String str =" ";
        boolean bool1 =str.isEmpty();//false space
        System.out.println(bool1);

        String username ="";

        if (username.isEmpty()){
            System.out.println("please provide the username");

            String s1 ="Cat";
            String s2 =new String("Cat");
            System.out.println(s1==s2);// false

            System.out.println(s1.equals(s2)); //true


            String z1 ="Tiger";
            String z2 = new String("Tiger");
            String z3 = "Tiger";
            System.out.println(z1==z3);
            System.out.println(z1==z2);

            System.out.println(z1.equals(z2));//true


            /*
            username :cyberyek
            password:cybertekschool
             */


        }

    }
}
