package day29_Wrapper_Arraylist;

import java.util.ArrayList;

public class List_Practice2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(20);
        list.add(300);
        list.add(400);
        list.add(50);
        list.add(700);
        list.add(800);

        int maximum = Integer.MIN_VALUE;
        //int maximum = list.get(0);
        // int maxsimum=-99999999999999;

        for (int i =0; i <list.size(); i++) {  // i :  0 1 2 3 4
            if (list.get(i)>maximum){
                maximum=list.get(i);

            }


        }
        System.out.println(maximum);


        int maximum2=Integer.MIN_VALUE;
        for (Integer each : list) {
            if (each > maximum2) {
                maximum2 = each;

            }
        }
        System.out.println(maximum2);


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);

        int maximum3=max(list2);
        System.out.println(maximum3);





    }
    public static  int max(ArrayList<Integer> list){

        int maximum = Integer.MIN_VALUE;
        //int maximum = list.get(0);
        // int maxsimum=-99999999999999;

        for (int i =0; i <list.size(); i++) {  // i :  0 1 2 3 4
            if (list.get(i)>maximum){
                maximum=list.get(i);

            }


        }
      return maximum;
    }

}
