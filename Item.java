

public class Item {

    private String name;

    private double price;

    private int quantity;


    
    
    
    
    public Item(String name, double price, int quantity){

        this.name = name;
        this.price = price;
        this.quantity =  quantity;

    }

    public Item(Item item){

        this.name = item.getName();

        this.price = item.getPrice();

        this.quantity = item.getQuantity();
    }




    public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}


public double getPrice() {
    return price;
}

public void setPrice(double price) {
    this.price = price;
}

public int getQuantity() {
    return quantity;
}

public void setQuantity(int quantity) {
    this.quantity = quantity;
}

public String toString(){

String temporaryVariable = "";

temporaryVariable += this.name+": ";

temporaryVariable += this.price+" ";

temporaryVariable += this.quantity;


    return temporaryVariable;
}

}

