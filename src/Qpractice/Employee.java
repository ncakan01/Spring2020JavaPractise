package Qpractice;

public class Employee {

    String name;
    long id;
    long ssn;
    String jobTitle;
    double salary;
    String gender;

    public Employee( String name, long id, long ssn, String jobTitle, double salary, String gender){
        this.name = name ;
        this.id = id;
        this.ssn = ssn;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;

    }
    public String toString(){
        return "name : "+ name + ", id: "+ id + ", ssn"+ ssn+" ,jobtitle: "+jobTitle+ ", salary "+salary+", gender"+gender;
    }
}
