package day26_MethodOverloading;

public class MetodOverloading {
    public static void main(String[] args) {

        method(10);    //"Orginal method"

        method(10.0);  // "Overloaded method"



    }

    public static void method(int a){
        System.out.println("Orginal method");
    }
    public static void method(double a){
        System.out.println("Overloaded method");
    }
}
