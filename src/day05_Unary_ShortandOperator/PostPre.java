package day05_Unary_ShortandOperator;

public class PostPre {

    public static void main(String[] args) {


        // pre : changes the value of the variable immediately

        int a =100;
        System.out.println(++a);//101
        System.out.println(a);//101

        int b =100;
        System.out.println(--b); // 99
        System.out.println(b);// 99

        // post: first passes the current value, then eventually changes the variable' value

        int A =100;
        System.out.println(A++); // at line 21 , A' values is still 100
        System.out.println(A);

        int B =100;
        System.out.println(B--); // 100
        System.out.println(B); // 99

        // post & pre example:
        int z =10;
        int x =++z; // at line, x is increased by
        System.out.println(x);//11
        System.out.println(z);//11

        int s =10;
        int f =s++;// 10 , after line 35 , the value of s will be increased by 1

        System.out.println(f);//10
        System.out.println(s); //11

        double t1 = 3.5;
        double t2=t1--;

        System.out.println(t2);//3.5
        System.out.println(t1);//2.5

        int num = 35;
        System.out.println(num++); // 35, after line 48 the value of num will be 36
        System.out.println(num--); // 36, after line 49 the value of num will 35







    }
}
