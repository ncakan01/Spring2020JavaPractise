package OfficeHours;

import java.util.ArrayList;
import java.util.Arrays;

public class DeveloperObject {
    public static void main(String[] args) {


        Developer developer1 = new Developer();
        developer1.setInfo("Leanardo", "Senior Developer", 160_000,18121993);
        System.out.println(developer1);

        Developer developer2 = new Developer();
        developer2.setInfo("Leon","Senior Developer",180000,12546);
       // System.out.println(developer2);

        developer1.coding();
        developer2.coding();

        developer1.fixingBug();
        developer2.fixingBug();

        System.out.println("==================================================================");

        Developer []   arr = {developer1,developer2};
        /*
        for (int i =0; i<arr.length; i++) {
            System.out.println(arr[i];

        }
         */

        for (Developer each : arr) {
            System.out.println(each.name+ " "+each.salary);
        }

        ArrayList<Developer>  developers = new ArrayList<>(Arrays.asList(arr));
        //developers.addAll(Arrays.asList(developer1,developer2));
        //System.out.println(developers.size());

/*
        for (int i = 0; i<developers.size(); i++){
            developers.get(i);  // sout kullan
        }
 */

        for (Developer each : developers){
            System.out.println(each.name+ " "+each.salary);
        }


    }
}