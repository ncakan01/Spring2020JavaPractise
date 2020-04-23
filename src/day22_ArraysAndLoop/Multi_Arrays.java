package day22_ArraysAndLoop;

import java.util.Arrays;

public class Multi_Arrays {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        //         0 1 2
        // n dimensional array contains (n-1) dimensional arrays

        // 2D array ; [index num ID array] [index num of element]
        int [][] arr2D={ {1,2,3}  , {4,5,6}};
                  //        0         1
        int[] arr1D =arr2D[0];  // {1,2,3}
        System.out.println(Arrays.toString(arr1D));//  [1.2.3]

        System.out.println(Arrays.toString(arr2D[0]));  // single dimensional array from arr2D

        System.out.println(arr2D[0][2]);// 3
        System.out.println(Arrays.deepToString(arr2D));  // [[ 1.2.3]]
        System.out.println(Arrays.toString(arr2D[1]));


        for (int each:arr2D[0]) {
            System.out.print(each+" ");

        }
        System.out.println();
        for (int i=0; i<arr2D[0].length; i++){
           int num= arr2D[0][i];
            System.out.println(num);
        }

    }
}
