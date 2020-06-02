package OfficeHours.Practice_05_13_2020;

public class statics {

    int instanceVariable = 100;
    static  int staticVariable = 200;

    public static void staticMEthod(){
        // instanceMethod();
        // System.out.println( instanceVariable );
        System.out.println( staticVariable );

        // static accept only static
    }





     public void  instanceMethod(){
        staticMEthod();
         System.out.println(staticVariable);
         System.out.println(instanceVariable);

     }

    public static void main(String[] args) {

       // System.out.println(instanceVariable);
        System.out.println(staticVariable);
        staticMEthod();
        // instanceMethod();
        // static accept only static
    }
}
