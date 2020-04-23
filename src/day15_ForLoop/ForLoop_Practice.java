package day15_ForLoop;

public class ForLoop_Practice {
    public static void main(String[] args) {
        /*
        odd number between 1~100 in a single line sperated by a space
        1,3,5,7,9
         */
        String result="";
        for (int number =1; number<=100; number+=2) {
            // System.out.println(number +" ");
            //result += number+" ";
            result=result+number+" ";

        }
        System.out.println(result);

        /*
        Even number between 0~100
                   2 4 6 8 10 ....
         */

        String resultEven="";
        for (int num=0; num<=100; num+=2){
            resultEven+=num+" ";
        }
        System.out.println(resultEven);
    }
}
