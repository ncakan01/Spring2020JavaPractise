package day22_ArraysAndLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
                 //  0  1   2  3 4
        for (int i = arr.length - 1; i >= 0; i--) {
            int eachNum = arr[i];
            System.out.println(eachNum); // 54321
           // System.out.println(Arrays.toString(arr));
        }

        System.out.println("==============================================");

        int[] Revarr = new int[arr.length]; // 0 0 0 0  0
/*
        Revarr[0]=arr[4];
        Revarr[1]=arr[3];
        Revarr[2]=arr[2];
        Revarr[3]=arr[2];
        Revarr[4]=arr[0];

 */     int j=arr.length-1;  //4
        for ( int i = 0; i<arr.length; i++){
            Revarr[i]=arr[j];
            j--;
           // System.out.println(Arrays.toString(Revarr));
        }

        System.out.println(Arrays.toString(Revarr));
    }
}