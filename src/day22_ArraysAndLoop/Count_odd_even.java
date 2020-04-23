package day22_ArraysAndLoop;
/*
4. write a program that can count the even and odd number from an array of integers
                        MUST use for each loop
 */

public class Count_odd_even {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9,10,11};

        int countodd=0;
        int counteven=0;

        for (int each:arr) {
            if (each %2 !=0){
                countodd++;
            }else{
                counteven++;
            }
            System.out.println("even numbers:" + counteven);
            System.out.println("odd numbers:" + countodd);
        }

    }
}
