package Resources;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    public static int[] sortDesending(int[] arr) {
        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr.length];

        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            RevArr[i] = arr[j];
            j--;
        }

        return RevArr;

    }

    public static String Reverse(String str) {
        String Reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            Reverse += str.charAt(i);
        }

        return Reverse;
    }

    public static String RemoveDulicates(String str) {
        // NONDUPLICATE  //AB

        String result = "";//AB

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (!result.contains("" + ch)) {
                result += ch;
            }


        }

        return result;
    }

    public static int Frequency(String str1, String str2) {
        int count = 0;
        while (str1.contains(str2)) {
            count++;
            str1 = str1.replaceFirst(str2, "");
            //we need to make that we are not counting the same index over again
        }
        return count;
    }

    public static String FrequencyOfChars(String str) {
        String NonDup = Library.RemoveDulicates(str);             //ABC
        String result = ""; //coantisn the frequency of chars

        for (int i = 0; i < NonDup.length(); i++) {
            String ch = "" + NonDup.charAt(i);//  "A"
            int num = Library.Frequency(str, ch);
            result += ch + num;
        }

        return result;
    }


    public static  int max(ArrayList<Integer> list){

        int maximum = Integer.MIN_VALUE;
        //int maximum = list.get(0);
        // int maxsimum=-99999999999999;

        for (int i =0; i <list.size(); i++) {  // i :  0 1 2 3 4
            if (list.get(i)>maximum){
                maximum=list.get(i);

            }


        }
        return maximum;
    }


}