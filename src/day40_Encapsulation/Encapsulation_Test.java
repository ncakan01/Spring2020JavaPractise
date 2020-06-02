package day40_Encapsulation;

public class Encapsulation_Test {
    public static void main(String[] args) {


        Encapsulation obj = new Encapsulation();


        //Encapsulation_Test obj2 = new Encapsulation_Test();
        //obj.SSN = 1000;

       // System.out.println(obj.SSN);

        System.out.println(obj.getSSN()); // 0

        obj.setSSN(123); // implict casting

        System.out.println(obj.getSSN());
    }
}