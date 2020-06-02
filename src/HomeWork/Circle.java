package HomeWork;

import java.text.DecimalFormat;

public class Circle {


    double radius;
    double diameter;
    static  double pi =3.14;

    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }
    public double area(){
        return pi*radius*radius;
    }
    public double perimeter(){
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }


}
class object {
    public static void main(String[] args) {
        Circle obj = new Circle(3.5, 5.2);

        System.out.printf("Perimeter: %.2f", obj.perimeter());
        System.out.println();
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(df.format(obj.area()));
    }
}