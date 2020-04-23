package day08_IfStatement;

public class MultiBranchIF {
    public static void main(String[] args) {
        int a= 100;
        /*
        boolean zero= a==0;
        boolean negative= a<0;
        boolean positive =a>0;

        if(zero){
            System.out.println("zero");
        }
        if (negative){
            System.out.println("Negative");
        }
        if (positive){
            System.out.println("Pozitive");
        }

         */
        if(a==0){
            System.out.println("zero");

        }else if (a>0){
            System.out.println("pozitive");
        }else {
            System.out.println("negative");
        }
    }
}
