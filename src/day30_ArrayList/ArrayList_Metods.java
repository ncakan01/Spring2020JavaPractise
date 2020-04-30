package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Metods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(7);
        list.add(8);
        list.add(1,6);


        list.set(3 ,9);

       // list.add(7.9);  // out of bound

        System.out.println(list);

        int [] arr={1,2, 3,4};
        arr [3] = 5;

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("A");
        list2.add("B");
        list2.add(1,"C");
        list2.add(1,"D");

        list2.set(3,"F");
        list2.set(2,"E");

        // A B C D

        System.out.println(list2);


        System.out.println("=================================================================");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);

        list3.remove(1);        //[1 3 4]

        Integer a=1;
        list3.remove(a);   //{3,4}

        System.out.println(list3);

        ArrayList<Integer> list4 = new ArrayList<>();

        list4.add(10);
        list4.add(20);
        list4.add(30);


        list4.remove(1);

        Integer a2=100;

        boolean r1 =  list4.remove(a2);

        System.out.println(r1);
        System.out.println(list4);
    }
}

