package day29_Wrapper_Arraylist;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {

        //ArrayList<DataType>  name = new ArrayList<DataType>();

        ArrayList<Integer> scores =new ArrayList<>();  // size =0
                                  // add five element , size :5
                                  // remove two element , size :3

        scores.add(10);  // Autoboxing  size :1
        scores.add(20);  // Autoboxing
        scores.add(30);  // size :3

        System.out.println(scores);
        Integer a1 = scores.get(2);  // none
        int a2 = scores.get(2); // unboxing
        double a3 = scores.get(2); // unboxing

        System.out.println(a3);

        }


    }

