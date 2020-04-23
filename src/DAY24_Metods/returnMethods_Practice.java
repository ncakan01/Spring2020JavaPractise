package DAY24_Metods;

import java.util.Arrays;

public class returnMethods_Practice {

    public static void main(String[] args) {
        int [] arr={9,8,7,200,58,40};
        int max =maxNmber(arr);
        System.out.println(max);

        int min =minNmber(arr);
        System.out.println(min);
    }

    public static int maxNmber(int [] arr){
        Arrays.sort(arr);
        return arr [arr.length-1];
    }
    public static int minNmber(int [] arr){
        Arrays.sort(arr);
        return arr [0];
    }

}
