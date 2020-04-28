package day29_Wrapper_Arraylist;

import java.util.ArrayList;

public class List_Practice {
    public static void main(String[] args) {

        ArrayList<String> shoppingList= new ArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Coffee");
        shoppingList.add("Bread");
        shoppingList.add("Toilet Paper");
        shoppingList.add("Eggd");

        for (int i = 0; i < shoppingList.size(); i++){
            System.out.println(shoppingList.get(i));
        }

        System.out.println("=================================================");

        for (String each : shoppingList) {
            System.out.println(each);

            System.out.println("=====================================");

            int lastIndex = shoppingList.size()-1;
            System.out.println(lastIndex);

        }

        System.out.println("=====================================================");

        // size();
        int size =shoppingList.size();
        System.out.println(size);




/*
        System.out.println(shoppingList);
        System.out.println(shoppingList.get(0));
        System.out.println(shoppingList.get(1));
        System.out.println(shoppingList.get(2));
        System.out.println(shoppingList.get(3));

 */




    }
}
