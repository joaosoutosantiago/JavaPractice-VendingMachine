package vendingMachine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");

        Item[][] items = new Item[][] {
            { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
            { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
            { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
        };
        
        Machine machine = new Machine(items);
        
        System.out.println(machine);
        
        boolean isOn = true;
        
        while (isOn) {
            System.out.print("Pick a row: ");
            int userRow = scan.nextInt();
            System.out.print("pick a spot: ");
            int userSpot = scan.nextInt();
            scan.nextLine();
            
            if (machine.dispense(userRow, userSpot)) {
            	System.out.println("\nEnjoy your drink! Press 1 to purchase another.");
            	int more = scan.nextInt();
            	if (more != 1) {
            		System.out.println("Thanks for using the Java vending machine.");
            		isOn = false;
            	} else {
            		System.out.println(machine);
            	}
            } else {
            	System.out.println("\nSorry. We're out of this item. Press 1 to purchase another.");
            	int more = scan.nextInt();
            	if (more != 1) {
            		System.out.println("Thanks for using the Java vending machine.");
            		isOn = false;
            	} else {
            		System.out.println(machine);
            	}
            }
        }
                
        scan.close();

	}

}
