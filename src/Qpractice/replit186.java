package Qpractice;

public class replit186 {
    public static void main(String[] args) {
        String a=extractNum("fgj878");
        System.out.println(a);
    }
    public static String extractNum(String s) {

        String result="";
        for (int i=0; i<s.length(); i++){
            if (Character.isDigit(s.charAt(i))){
                result+=s.charAt(i);
            }
        }
        return result;

    }
}
