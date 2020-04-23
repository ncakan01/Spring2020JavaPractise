package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class ArraysUtility {
/*
Arrays.sort();   sorts the array in Ascending order
Arrays.equal();
Arrays.toString();

Arrays.deepToString();
 */
    public static void main(String[] args) {

        int [] arr={ 9, 10 , 65 ,8 , 6, 8,5};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);    //[ 5 ,6 , 8, 8, 9, 10, 65]

        System.out.println(Arrays.toString(arr));


        int [] salaries={1000000, 20000, 30 ,5000, 432, 123123 , 200000 };
        int length=salaries.length;
        int lastIndex=length-1;
         Arrays.sort(salaries);
        System.out.println(Arrays.toString(salaries)); //[30, 432, 5000, 20000, 123123, 200000, 1000000]

        System.out.println("Minimum salary :" + salaries[0]);
        System.out.println("Maxsimum salary ; " +salaries[lastIndex]);


    }
}
