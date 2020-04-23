package DAY20_ArraysContinue;

import java.util.Arrays;

public class ArraysUtilities {
    public static void main(String[] args) {

        int [] arr={1,2,3};
        String  r = Arrays.toString(arr);
        System.out.println(r);
        System.out.println(arr);  //array must be converted to String before print

        String names[]={"medine","fatih","osman"};
        System.out.println(Arrays.toString(names));

        double[] nums={10,20,30,40,50};
        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0] +1);

        int [] array1={1,2,3};
        System.out.println(Arrays.toString(array1));
        int [] array2={4,5,6,7};
        System.out.println(Arrays.toString(array2));

        int [] array3= new int[array1.length+array2.length];
        System.out.println(Arrays.toString(array3));




    }
}
