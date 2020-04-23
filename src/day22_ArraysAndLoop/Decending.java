package day22_ArraysAndLoop;

import java.util.Arrays;

public class Decending {

    public static void main(String[] args) {

        // 1. sort the array in ascedning
        // 2. reverse the array that's sorted in ascending  ==> descending


        int[] arr = {10, 78, 2, -1, 500, 70};
        Arrays.sort(arr);   // sort in ascending

        System.out.println(Arrays.toString(arr));

        int[] RevArr = new int[arr.length];


        int j = arr.length - 1;  //4
        for (int i = 0; i < arr.length; i++) {
            RevArr[i] = arr[j];  // decending
            j--;
            //System.out.println(Arrays.toString(RevArr));  // sunucu 5 kere tekrarliyor
        }
        System.out.println(Arrays.toString(RevArr));
    }
}
