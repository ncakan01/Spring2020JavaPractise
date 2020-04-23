package OfficeHours;

import java.util.Arrays;

public class return_Method2 {

    // write a return method that return the second max number from an int array

    public static void main(String[] args) {
        int [] arr= {100,40,500,30,100,-5,-100};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        int lastIndexNum=arr.length-1;
        int secondLastIndexNum=lastIndexNum-1;/// arr.lenght-2
                             //arr.length-1-1=arr.length-2

        secondLastIndexNum=arr[secondLastIndexNum];

        System.out.println(secondLastIndexNum);

        System.out.println("=====================================================================");
        int[] arr2 = { 1,2,3,4,5,6,7,8};

        int num2 = secondMax(arr2);

        System.out.println(num2);



    }
    public static int secondMax(int [] arr){
        Arrays.sort(arr);

        System.out.println( Arrays.toString(arr));
        int lastIndexNum = arr.length-1;
        int secondLastIndexNum = lastIndexNum - 1; // arr.length -2
        //                        arr.length-1-1 = arr.length -2

        int secondMaximum = arr[secondLastIndexNum];

        return secondMaximum;

    }



}

