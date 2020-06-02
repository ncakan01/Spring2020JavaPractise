package Qpractice;

public class replit194 {
    public static void main(String[] args) {
        boolean a=isPalindrome("noon");
        System.out.println(a);
    }
    public static boolean isPalindrome(String check) {
        String reversed="";
        for(int i=check.length()-1; i>=0; i--){
            reversed+=check.charAt(i);
        }
        boolean qpal=check.equals(reversed);
       return qpal;
    }
}
