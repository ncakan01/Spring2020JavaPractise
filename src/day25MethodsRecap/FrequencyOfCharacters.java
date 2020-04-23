package day25MethodsRecap;

import Resources.Library;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str="AABBCC";//A2B2C2
        String nonDup= Library.RemoveDulicates(str);
        String result="";

        for (int i=0; i<nonDup.length(); i++) {
            String ch =  ""+ nonDup.charAt(i);//A
            int num = Library.Frequency(str, ch);
            //System.out.println(ch + num);
            result+=ch+num;

        }
        System.out.println(result);
    }
    public static String FrequencyOfChars(String str){
        String NonDup =  Library.RemoveDulicates(str)  ;             //ABC
        String result = ""; //coantisn the frequency of chars

        for(int i =0; i < NonDup.length();i++){
            String ch = ""+NonDup.charAt(i);//  "A"
            int num =  Library.Frequency(str, ch);
            result += ch+num;
        }

        return result;
    }
}
