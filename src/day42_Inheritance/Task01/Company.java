package day42_Inheritance.Task01;

public class Company {
    public static  Employee employee1;
    public static  Employee employee2;
    public static  Employee employee3;
     static  {

        employee1 = new Employee();
        employee1.setEmployeeInfo("Messi", 32, 'M', 140_000, 13654,"FullTime");

        employee2 = new Employee();
        employee2.setEmployeeInfo("Aigerim", 18, 'F', 130_000, 65654,"FullTime");

        employee3 = new Employee();
        employee3.setEmployeeInfo("Safar", 25, 'M', 128_000, 6599,"FullTime");

    }

    public static void main(String[] args) {
        Employee [] employees = {employee1,employee2,employee3};

        for (int i = 0; i<employees.length; i++){
           // System.out.println(employees[i]);
            System.out.println("Name: "+employees[i].name+ ",ID: "+ employees[i].employeeID );
        }
    }
}
