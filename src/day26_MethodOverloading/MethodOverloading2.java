package day26_MethodOverloading;

import java.util.Arrays;

public class MethodOverloading2 {

    public static void main(String[] args) {
      //  10 , 5
        sum2Numbers(10,5);

        // 10 , 5 , 5
        sum3Numbers(10, 5, 5);

        // 10 , 20 ,30 ,5
        sum4Numbers(10,20,30,5);

        System.out.println("===========================================================================================");
        //  10 , 5
        sum(10,5);

        // 10 , 5 , 5
        sum(10,5,5);

        // 10 , 20 ,30 ,5
        sum(10,20 ,30,5);

        int [] arr1={3,2,1};

        char [] arr2 ={'z' ,'s' ,'a'};

        double [] arr3={7.5 , 6.7 , 3.2};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);


    }


    public static void sum2Numbers(int a, int b) {
        System.out.println(a + b);
    }

    public static void sum3Numbers(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void sum4Numbers(int a, int b,int c ,int d) {
        System.out.println(a + b + c +d);
    }
    //===================================================================================================================

    public static void sum(int a , int b){
        System.out.println(a + b);
    }
    public static void sum(int a , int b, int c){
        System.out.println(a + b + c);
    }
    public static void sum(int a , int b, int c , int d){
        System.out.println(a + b + c + d);
    }








}