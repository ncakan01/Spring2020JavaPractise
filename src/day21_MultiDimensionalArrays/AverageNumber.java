package day21_MultiDimensionalArrays;

public class AverageNumber {
    /*
1. write a program that can return the average number from an array of integers
            ex:
                [1,2,3]
                average: 2
                [10, 15, 5, 6]
                average: 9
                [4, 5, 6, 7, 8, 10, 20, 30, 0]
                average: 10
 */

    public static void main(String[] args) {

        int [] arr={10,20,30,40,50};

        //avarage: average: sum all number/length


        int length=arr.length;   //total number of the elements
        int sum=0;
        for (int i=0; i<=length-1; i++){
            int eachNum=arr[i];
            sum+=arr[i];

        }
        System.out.println(sum);
        System.out.println(sum/length);
        /*
        [2,1.3]
        [1,2,3]

         */
        int [] arr2={1,2,3};  // 5/3

        double average=sum/length;
        System.out.println(average);

        System.out.println(5/3);
        System.out.println(5/(double)3);












    }
}
