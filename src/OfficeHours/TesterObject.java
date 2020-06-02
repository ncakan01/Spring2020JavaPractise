package OfficeHours;

public class TesterObject {
    public static void main(String[] args) {

       Tester tester1= new Tester();
       tester1.name = "Muhtar";
       tester1.jobTitle = "SDET";
       tester1.salary = 900000;
       tester1.employeeID = 123456;

        System.out.println(tester1);

        Tester tester2= new Tester();
        tester2.setInfo("Onur","Junior Tester",75000,1245);

        System.out.println(tester2);

        tester1.smokeTesting();
        tester2.smokeTesting();

        tester2.creatingTicket();



    }
}
