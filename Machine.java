public class Machine {
    
    private Item[][] items;

    

    public Machine(Item[][] items){

this.items = new Item[items.length][items.length];

        for (int row = 0; row < items.length; row++) {
            
            for (int spot = 0; spot < items[row].length; spot++) {
                


                this.items [row][spot] = new Item(items[row][spot]);
            }
        }


    }

    public Item getItem(int row, int spot){

        return new Item(items[row][spot]);

    }

    public void setItem(Item item, int row, int spot){

        this.items[row][spot] = new Item(item);

    }


    public boolean dispense(int row,int spot){

        if (0<getItem(row, spot).getQuantity()) {
    
        this.items[row][spot].setQuantity(getItem(row, spot).getQuantity()-1);

        return true;

        }else{

        return false;
        }

        
    }


public String toString(){

String temporaryVariable = "";



for (int row = 0; row < this.items.length; row++) {

    for (int spot = 0; spot < this.items[row].length ; spot++) {
        
        if(spot==0){

            temporaryVariable += "\t";

        }
        
        temporaryVariable += this.items[row][spot]+" ";

        if (spot >= 2) {

           temporaryVariable += "\n\n";
            
        }

    }
    

}

temporaryVariable += "\t******************************************";

    return temporaryVariable;
}


}
