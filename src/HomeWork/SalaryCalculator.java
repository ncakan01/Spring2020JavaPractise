package HomeWork;

public class SalaryCalculator {
    /*
     instance variables:
                hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
            add a constructor can initialize those fields
            instance methods:
                salary(): returns the total salary as double
                salaryAftertax(): retuns the salary after tax as double
                stateTax(): retuns the total state tax as double
                federalTax(): retuns the total federal tax as double
                toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
     */

    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double fedralTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate, double fedralTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.fedralTaxRate = fedralTaxRate;
    }

    public double salary(){
        return hourlyRate*weeklyHours*52;
    }
    public double salaryAftertax(){
        return salary()-federalTax() -stateTax();
    }
    public double stateTax(){
        return stateTaxRate*salary();
    }
    public double federalTax(){
        return salary()*fedralTaxRate;
    }

    @Override
    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", stateTaxRate=" + stateTaxRate +
                ", fedralTaxRate=" + fedralTaxRate +
                '}';

    }

}
class Hesaplama{
    public static void main(String[] args) {
        SalaryCalculator obj1 = new SalaryCalculator(45,38,0.04,0.02);

        SalaryCalculator obj2 = new SalaryCalculator(75,40,0.05,0.01);

        SalaryCalculator obj3 = new SalaryCalculator(60,28,0.07,0.03);

        int total=0;

        System.out.println(obj2.federalTax());

       SalaryCalculator [] arr = {obj1,obj2,obj3};
       for (SalaryCalculator each : arr){
           total +=each.salaryAftertax();

       }
        System.out.println(total);











    }
}

