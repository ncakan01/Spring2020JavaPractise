package OfficeHours;

public class Tester {
    String name;
    long employeeID;
    String jobTitle;
    double salary;

    public void smokeTesting(){
        System.out.println(this.name+" is doing test" );
    }

    public void creatingTicket(){

        System.out.println( this.name +" is creating ticket on Jira");
    }



    public void setInfo(String name,  String jobTitle, double salary , long employeeID){
        this.name = name;   // user given argument is assigned to instance variable
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public String toString(){
        return "Name: "+name+", job Title: "+jobTitle
                +", salary: "+salary+", employee id: "+employeeID;
    }
}
