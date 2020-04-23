package DAY24_Metods;

public class ReturnMethods {

    public static void maxNum(int a , int b){
        if (a>=b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

    }

    public static void main(String[] args) {
        maxNum(10,20);

        int result =Addition(1000,2000);
        System.out.println(result);
        int result2=result+2000;
        System.out.println(result2);
    }

    public static int Addition(int a, int b){
       // System.out.println(a+b);
        return a+b;
    }

}
