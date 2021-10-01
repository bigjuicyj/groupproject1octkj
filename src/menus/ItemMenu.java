package menus;

import controllers.ItemController;

import java.util.Scanner;

public class ItemMenu {

    public static void itemMenu(){
        System.out.print(
                "\n\n"
                        + "Items options menu:\n"
                        + "\n"
                        + "0. Return to Main Menu.\n"
                        + "1. Create an Items.\n"
                        + "2. Remove an Item :(\n"
                        + "3. Print all registered Items.\n"
                        + "4. Hire an Item.\n"
                        + "5. Update an Item's name.\n"
                        + "6. Update an Item's price.\n"
                        + "\n"
        );

        String userInput = utilities.UserInput.readInput();
        switch (userInput){
            case "0":
                System.out.println("0. Returning to main menu...");
                MainMenu.printMainMenu();

                break;

                case "1":
                System.out.println("1. Creating an item:\n"
                        +"Input item ID, name and price:");
               // TODO: Write UserInput method for reading a double
                Scanner scanner = new Scanner(System.in);
                String itemID = scanner.nextLine(); // take out and replace with userinput
                String itemName = scanner.nextLine(); // take out and replace with user input
                double itemPrice = scanner.nextDouble();

                System.out.println(ItemController.createItem(itemID, itemName, itemPrice));
                //insert item option menu here

                break;

            case "2":
                System.out.println("2.Remove an Item");
                //insert review options here
                break;

            case "3":
                System.out.println("3. Print all registered Items.");
                //insert Transaction History options
                break;
            case "4":
                System.out.println("4. Hire an Item");
                break;
            case "5":
                System.out.println("5.Update an Item's name.");
                break;
            case "6":
                System.out.println("6. Update an Item's price.");
                break;

            default:
                System.out.println("Going back to Main Menu... Please type in another option from 0-3");
                MainMenu.printMainMenu();
                break;
        }
    }
}


