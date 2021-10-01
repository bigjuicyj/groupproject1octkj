package menus;

import utilities.UserInput;

public class ReviewMenu {

    public ReviewMenu(){
        System.out.print(
                "\n\n"

                        +"0. Return to Main Menu\n"
                        +"1.Create review for an Item.\n"
                        +"2. Print a specific review of an Item.\n"
                        +"3. Print all reviews of an Item.\n"
                        +"4. Print mean grade of an Item.\n"
                        +"5. Print all comments of an Item.\n"
                        +"6. Print all registered reviews.\n"
                        +"7. Print item(s) with most reviews.\n"
                        +"8. Print item(s) with least reviews.\n"
                        +"9. Print item(s) with best mean review grade.\n"
                        +"10. Print item(s) with worst mean review grade.\n"
        );

        String userInput = UserInput.readInput();
        switch (userInput){
            case "0":
                System.out.println("0. Returning to main menu...");
                MainMenu.printMainMenu();

                break;
            case "1":
                System.out.println("1. Create a review for selected item");
                break;
            case "2":
                System.out.println("2.Print a specific review of an Item");
                break;
            case "3":
                System.out.println("3. Print all reviews of an Item.");
                break;
            case "4":
                System.out.println("4. Print mean grade of an Item");
                break;
            case "5":
                System.out.println("5. Print all comments of an Item.");
                break;
            case "6":
                System.out.println("6. Print all registered reviews.");
                break;
            case "7":
                System.out.println("7. Print item(s) with most reviews.");
                break;
            case "8":
                System.out.println("8. Print item(s) with least reviews.");
                break;
            case "9":
                System.out.println("9. Print item(s) with best mean review grade.");
                break;
            case "10":
                System.out.println("10. Print item(s) with worst mean review grade.");
                break;


            default:
                System.out.println("Invalid option. Going back to Main Menu... Please type in a valid option from 0-10.");
                MainMenu.printMainMenu();
                break;
        }
    }


    public static void reviewMenu() {
    }
}



