package DAY24_Metods;

import Resources.Library;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        String str="Muhtar";
      String RevStr=  Library.Reverse(str);

        System.out.println(RevStr);


        int [] arr={5 ,9, 10, 3,2,-1};
        int [] RevArr= Library.sortDesending(arr);

        System.out.println(Arrays.toString(RevArr));
    }
}
