package Qpractice;

public class replit189 {
    public static void main(String[] args) {
        boolean a =isError("error foo bar");
        System.out.println(a);
    }
    public static boolean isError(String line){


        if (line.startsWith("error")) {
            return true;

        }else{
            return false;
        }
    }
}
