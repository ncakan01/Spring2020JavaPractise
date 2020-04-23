package day19_Arrays;

public class Arrays_intro {
    public static void main(String[] args) {
       // int scores=90 , 10,20;  reqular varables can only have one data
        /*
        decleration :
        DataType variableName=(data1 ,data2 . data3};
        // 70,75,85,90,95,100

         */

        int[]  scores={70,75,85,90,95,100};
            //          0 1  2  3   4  5
        //retrive: varableName[index]

        int num1 =scores[2];//int
        System.out.println(num1);

        int num2=scores[5];
        System.out.println(num2);


    }
}
