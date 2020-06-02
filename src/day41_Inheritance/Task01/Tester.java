package day41_Inheritance.Task01;
/*
create sub class of employee name it Tester:
			variables: salary, name, id, jobTitle, gender
			actions: reportingBug, testing
 */
public class Tester extends Employee{

   public Tester(String name , double salary ,int id , String jobTitle, char  gender){

       this.name = name ;
       this.salary = salary;
       this.jobTitle = jobTitle ;
       this.gender = gender;

    }



    public void  reporting(){
        System.out.println(name + " is reporting bug" );
    }
    public void testing(){
        System.out.println(name+ " is testing");
    }
}
