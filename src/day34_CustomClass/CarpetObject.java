package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject {
    public static void main(String[] args) {
        Carpet [] carpets = {new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet()};

        carpets [0].customorder(7,8.5,20,true);
        carpets [1].customorder(10,15,30,false);
        carpets [2].customorder(9,20,15,true);
        carpets [3].customorder(20,18,25,false);
        carpets [4].customorder(35,45,30,true);
        System.out.println(carpets[0]);
        System.out.println(carpets[1]);
        System.out.println(carpets[2]);

        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        for (Carpet eachCarpet : carpets){
            if (eachCarpet.isPersian){
                persianCarpets.add(eachCarpet);
            }
        }
        System.out.println("there are "+persianCarpets.size()+" persian carpet");
        System.out.println( persianCarpets.get(0).calcCost());
        System.out.println( persianCarpets.get(1).calcCost());

        ArrayList<Carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpets));
        //regularCarpets.removeAll(persianCarpets);
        regularCarpets.removeIf(p->p.isPersian);

        for (int i = 0; i < regularCarpets.size(); i++){
            System.out.println(regularCarpets.get(i).calcCost());


        }

        System.out.println(" there are " +regularCarpets.size()+ " regular carpets");
       // System.out.println(regularCarpets.get(0).calcCost());
       // System.out.println(regularCarpets.get(1).calcCost());
       // System.out.println(regularCarpets);




    }
}

