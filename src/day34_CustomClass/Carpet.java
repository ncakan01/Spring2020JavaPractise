package day34_CustomClass;
/*
2. create a custom class for the carpet class that should contain the following:
				instance variables:
						width, length, unitPrice, isPersian (boolean)
				instance methods:
						customOrder(): sets the carpet' width, length, unitprice, & isParsian
						calcCost(): should be able to caculate the total cost of the carpet and return it as double
						toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
			total price of carpet= (width+length)*unitprice
			if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
:+1:
16
:tired_face:
2
:100:
4
:ok_hand:
1
:muscle:
1


 */
public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public double calcCost(){
        double total=(width + length) * unitPrice;

        if(isPersian){
            return total+200;
        }else{
            return total;
        }
        //return (isPersian) ? total+200:total;
    }
    public void customorder(double Carpetwidith,double carpetLength , double carpetunitPrice, boolean Persian){
        width = Carpetwidith;
        length = carpetLength;
        unitPrice = carpetunitPrice;
        isPersian = Persian;

    }
    public  String toString(){
        return "Width: " + width+
                "\nlength: "+ length+
                "\nunit price: " + unitPrice+
                "\ncosts "+calcCost();
    }


  //  total price of carpet= (width+length)*unitprice
}
