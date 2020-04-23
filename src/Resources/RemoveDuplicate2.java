package Resources;

public class RemoveDuplicate2 {
    public static void main(String[] args) {


        String str = "ABABAAABBBBBBAAA";   // NONDUPLICATE  //AB

        String result = "";//AB

        for (int i = 0; i <str.length(); i++) {

            char ch =str.charAt(i);
            if (!result.contains(""+ch)){
                result+=ch;
            }


        }
        System.out.println(result);


        String str2="ABCABCABCABC";

        String result2= RemoveDulicates(str2);
        System.out.println(result2);

    }
    public  static String RemoveDulicates(String str){
           // NONDUPLICATE  //AB

        String result = "";//AB

        for (int i = 0; i <str.length(); i++) {

            char ch =str.charAt(i);   /// abab
            if (!result.contains(""+ch)){
                result+=ch;
            }


        }

        return result;
    }

}
