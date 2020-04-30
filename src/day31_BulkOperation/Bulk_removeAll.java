package day31_BulkOperation;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_removeAll {
    public static void main(String[] args) {



        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,3,3,3,3,3,3,3 ));
        // remove 1,3,5,8
        /*
        Integer a= 1;
        list.remove(a);
        list.remove(a);

        Integer b = 3;
        list.remove(b);
        list.remove(b);
         */
        list.removeAll(Arrays.asList(3 ,1));

        System.out.println(list);


        /*
             1. write a program that can revome duplkcates from an arraylist
         */
        System.out.println("===================================================");

        String [] names = {"Ahmet" , "John" , "Ayse" , "Ahmet" , "Daniel"};

        ArrayList<String > namelist = new ArrayList<>(Arrays.asList(names));

        System.out.println(namelist);

        namelist.removeAll(Arrays.asList("AHmet"));
        System.out.println(namelist);


    }
}
