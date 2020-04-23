package day18Nested_loop;

public class do_While_Loop2 {
    public static void main(String[] args) {

        int number = 103;// print the number 100~number

        while (number>=100){
            System.out.print(number+" ");
            number--;
        }
        System.out.println("=======================================================================================");
        System.out.println();
        int number2=103;
        do{
            System.out.print(number2+" ");
            number2--;
        }while (number2<=100);
    }
}
