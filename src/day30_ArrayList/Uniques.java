package day30_ArrayList;

import java.util.ArrayList;

public class Uniques {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);

        ArrayList<Integer> uniques = new ArrayList<>();

        //list.get(0);  ==> 1
        for (int i = 0; i < list.size(); i++) {

            int count = 0;
            for (Integer each : list) {

                if (each == list.get(i)) {   // i : 0 1 2
                    count++;
                }
            }
                if (count == 1) {
                    uniques.add(list.get(i));
                }

            }
        System.out.println(list);
            System.out.println(uniques);

        }
    }

