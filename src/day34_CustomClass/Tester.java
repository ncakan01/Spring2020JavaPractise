package day34_CustomClass;

public class Tester {
/*
	Attributes:
				name, employeeID, JobTitle, Salary
			Actions:
				setTesterInfo(), smokeTesting(),  creatingTicket();
 */
    String name;
    long employeeID;
    String jobTitle;
    double salary;

public void smokeTesting(Tester tester2 , Tester tester1){
    System.out.println(name+ " is smoking ");
    //System.out.println(name + name + " is smoking");

}

    public void setTesterInfo(String name, long employeeID, String jobTitle, double salary){
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString(){
        return "Name: "+name+", job Title: "+jobTitle
                +", employee id: "+employeeID+", salary: "+salary;
    }


}
