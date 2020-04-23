package day18Nested_loop;

/*
1. write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators
                 10/3 ==> wirh remainder 1
                 (a>=b)
                 a=a-b=7;
                 a=a-b=4
                 a=a-b=1
 */
public class DivideTwoNumber {
    public static void main(String[] args) {
        int a=20;
        int b= 3;

        if (b ==0) {
            System.out.println("divisor cannot be zero");
            System.exit(0);
        }

        int count=0;//cound the execution of the loop

        while(a >= b) {
            a -= b;
            count++;
        }
        if (a==0) {
            System.out.println("The resukt is" + count);
        }else{
            System.out.println("The resukt is " + count +"with a remainder of " +a);
        }
    }

}
