package day42_Inheritance.Task01;
/*
create a subclass of Data called Student
				attributes: name, age, gender, studentID, clazz
				methods: attendClass, code, setStudentInfo, toString

 */

              /*
    name (Inherited)
    age (Inherited)
    gender (Inherited)
    studentID
    clazz
    shcoolName = "Cybertek University"
     setPersonInfo() (inherited)
     eat() (inherited)
     sleep() (inherited)
     walk() (inherited)
     drink() (inherited)
    setStudentInfo
     attendClass
      code
       toString
     */


public class Student extends Person{
    public long  studentID;
    public String clazz;
    public static String schoolName = "Cybertek";

    public void setStudentInfo (String name ,int age,char gender,long studentID, String clazz) {
        setPesrsoInfo(name,age,gender);
        this.studentID = studentID;
        this.clazz = clazz;
    }
    public void attendClass(){
        System.out.println(name + " is coding");
    }
    public void code(){
        System.out.println(name + " is coding");
    }
    public String toString(){
        return "Name: "+name+", ID: "+studentID+",  age: "+age+", gender: "+gender+", class: "+clazz+ ", school name:"+schoolName;
    }

}
