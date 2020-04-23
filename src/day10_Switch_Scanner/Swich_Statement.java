package day10_Switch_Scanner;

public class Swich_Statement {
    public static void main(String[] args) {
        byte a =2;

        float a1 = 4.5f;
        long a2 = 10l;
        double a3 = 2.5d;
        boolean a4 = true;


        switch (a){
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            default:
                System.out.println("invalid case");
                break;

        }
    }
}
