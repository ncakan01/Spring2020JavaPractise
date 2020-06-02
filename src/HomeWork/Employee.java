package HomeWork;

public class Employee {
    /*
    	instance variables:
					name, id, ssn, jobTitle, salary, gender
			actions:
					setEmployeeInfo(): can initialize all the instance variables
					toString(): can return the info of the employee as string

     */

    String name;
    int id;
    long ssn;
    double salary;
    char gender;

    public void setEmplyeeInfo(String name,int id,long ssn,double salary,char gender){
        this.name = name;
        this.id = id;
        this.ssn = ssn;
        this.salary = salary;
        this.gender = gender;


    }
    public String toString(){
        return "Name: "+name+", id: "+id+", ssn: "+ssn+", salary: "+salary+", gender: "+gender;
    }

}
