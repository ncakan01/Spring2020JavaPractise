package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class Item {
    /*
    	instance variables:
				name, unitPrice, quantity
			add a constructor that can initialize the fields
			instance methods:
				calcCost(): returns the total cost as double
							hint: quantity * unitPrice
				toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
	create a class called ShoppingList
			create 5 objects of Item and store them into List of Items
			calculate the total cost of all Items in the list
     */

    String name;
    double unitPrice;
    int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    public double calCost(){
        return quantity * unitPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }

}
class ShoppingList{
    public static void main(String[] args) {
        Item item1 = new Item("milk",2.5,3);
        Item item2 = new Item("water",2.9,9);
        Item item3 = new Item("tea",3.5,2);
        Item item4 = new Item("tomato",1.5,8);
        Item item5 = new Item("patato",5.5,6);

        ArrayList<Item> items = new ArrayList<>(Arrays.asList(item1,item2,item3,item4,item5));
        double total=0;
        for (Item each :items) {
            total+=each.calCost();

        }
        System.out.println(total);

    }
}