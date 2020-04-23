package day17_WhileLoops;

public class WhileLoop {
    public static void main(String[] args) {
        /*
        while(10>9){
            System.out.println("hello world");
        }
         */

        for (int i=0; i<=5; i++){
            System.out.println(i);
        }
        System.out.println("====================================");
        int i =0;
        while(i<=5) {
            System.out.println(i);
            i++;
            //System.out.println(i); stars 1 2 3 4 5 6
        }
        System.out.println("===========================================");
        while (true){
            System.out.println("hello word");
        }
    }
}
