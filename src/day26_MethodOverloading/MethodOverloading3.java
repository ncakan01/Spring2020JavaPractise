package day26_MethodOverloading;

public class MethodOverloading3 {
    /*
first method: can find the sum of two int numbers
second method: can find the sum of two double numbers
 */
    public static void main(String[] args) {
        sum(11,5);
        //sum(10.4 , 3.5);
    }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

}