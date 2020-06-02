package day37_Constructors;

public class CybertekStudent {
    static String schoolName = "Cybertek  University";
    String studentName;  // we must need to know
    int groupNumber;   // we must need to know
    String batch;   //// we must need to know

    public CybertekStudent(String studentName,int groupNumber,String batch){
        //schoolName = "Cybertek  University";
        this.batch=batch;
        this.groupNumber=groupNumber;
        this.studentName=studentName;

    }
    public String toString(){
        return "Name: "+studentName+", Batch: "+batch+", in group:  " +groupNumber+", School name: "+schoolName;
    }
}

class CObject{
    public static void main(String[] args) {
        CybertekStudent student1 = new CybertekStudent("Drar",3,"Batch 18");
        student1.schoolName = "Cybertek School";
        System.out.println(student1);

        CybertekStudent student2 = new CybertekStudent("NUR",12,"Batch 18");

        System.out.println(student2);

    }
}
