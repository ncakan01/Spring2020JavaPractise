package day09_NestedIf_Ternary;
 /*
    write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( >= 55 )
                  age cannot be negative or greater than 150
     */

public class ageGroups_NestedIf {
    public static void main(String[] args) {
        int age =21;
        String ageGroup ="";

        if (age<150 && age>0){
            if(age<21){
                ageGroup="teenager";
            }else if (age>=21 && age<55){
                ageGroup="adult";
            }else{
                ageGroup="senior";
            }
        }else{
            ageGroup="invalid entry";
        }
        System.out.println("==================================================================================================================");

        int age2 =45;
        String ageGroup2 ="";

        if(age2 < 150 && age2 > 0 ){

            ageGroup2 = (age2 < 21) ? "Teenager" :(age2<55)? "Adults" : "Senior";

        }else{
            ageGroup2 = "Invalid Entry";
        }

        System.out.println(ageGroup2); // Adult


    }
}
