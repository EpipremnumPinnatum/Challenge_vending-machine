import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\t******************************************");
        System.out.println("\t          WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t******************************************");
        

        Item[][] items = new Item[][] {
             { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
             { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
             { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
         };
        
         Machine machine = new Machine(items);

         System.out.println(machine);

         while(true) {
             
            System.out.println("Pick a row: ");
         int userRow = scanner.nextInt();

            System.out.println("Pick a spot in the row: ");

         int userSpot = scanner.nextInt();

         boolean availability= machine.dispense(userRow, userSpot);

         if (availability == true) {

            System.out.println("\nEnjoy your drink! Press 1 to purchase another: ");
             
         }
 
         if (availability == false) {
             
            System.out.println("\nSorry, we're out of this item. Press 1 to purchase another: ");

            scanner.nextLine();
            String userInput = scanner.nextLine();

            if (userInput != "1") {

                break;
                
            }
         }
         
            System.out.println("\n"+machine);
         }
         

       scanner.close();
    }


    
}

// AT Vending Machine Part 4
