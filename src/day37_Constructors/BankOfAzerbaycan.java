package day37_Constructors;

import java.util.ArrayList;

public class BankOfAzerbaycan {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        list.add(HumanResources.employee3);//0
        list.add(HumanResources.employee5);//1

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
