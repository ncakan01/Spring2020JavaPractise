package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class StringMetods {
    public static void main(String[] args) {

        String name ="Java";  // 'J' ,'a' ,'v','a'

        char [] chars=name.toCharArray(); //

        System.out.println(chars[0]);  //'J'
        System.out.println(chars[3]); //'a'

        //System.out.println(chars[4]);

        String str= "I like Java";

        String [] arr=str.split(" ");  // RETURN THE ARRAY [I, like, Java]

        System.out.println(Arrays.toString(arr));

        /*
        reverse sentence: day great is today;
         */

        String sentence ="Today is great day";

        String [] words=sentence.split(" ");

        System.out.println(Arrays.toString(words));  //[Today, is, great, day]

        String result="";

        for (int i=words.length-1; i>=0; i--){

            String eachWords=words[i];
          //  System.out.println(eachWords +" ");
            result+=eachWords+" ";

        }
        System.out.println(result);


        System.out.println("==================================================");

        String str2="ABCD";
        String arr2[]=str2.split("") ;
        char [] ch2=str2.toCharArray();

        System.out.println(Arrays.toString(arr2 ));
        System.out.println(Arrays.toString(ch2));










    }
}
