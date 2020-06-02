package HomeWork;

import java.util.ArrayList;

public class BankOfAzerbaijan {

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(HumanResources.employee2);
        list.add(HumanResources.employee4);

        for (Employee each : list) {
            System.out.println(each);

        }
        System.out.println(list.get(0));
        System.out.println(list.get(1));

    }
}
