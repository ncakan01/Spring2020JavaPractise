package OfficeHours;

public class Developer {
    String name;
    long employeeID;
    String jobTitle;
    double salary;

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
    public void coding(){
        System.out.println(name + "  coding");
    }
    public void  fixingBug(){
        System.out.println(name+" fixing bug");
    }
}
