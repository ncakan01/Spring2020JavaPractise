package day38_Constructors;

public class Item {

    String name;
    double unitPrice;
    int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){
        return quantity * unitPrice;
    }

    @Override
    public String toString() {
        return "Item: "+name+", Unit price: $"+unitPrice+", Quantity: "+quantity+
                "\nTotal Cost of Item: $"+calcCost();
    }
}
