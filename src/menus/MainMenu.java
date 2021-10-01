package menus;

import utilities.UserInput;

public class MainMenu {

    public static void printMainMenu() {
        System.out.println ("Main Menu: Please choose among the options below.\n" +
        "\n" +
        "0. Close system.\n" +
        "1. Open Item options.\n" +
        "2. Open Review options.\n" +
        "3. Open Transaction History options. \n" +
        "\n" +
        "Type an option number: \n" );

        String userInput = UserInput.readInput();
        switch (userInput){
            case "0":
                System.exit(404);
                break; //stops the switch statement from checking the other cases bellow

            case "1":
                System.out.println("Here are your item options:");
                ItemMenu.itemMenu();
                break;

            case "2":
                System.out.println("Here are your review options:");
                ReviewMenu.reviewMenu();
                break;

            case "3":
                System.out.println("Here are your transaction history options:");
                TransactionHistoryOptions.printTransactionsHistoryOptions();
                break;

            default:
                System.out.println("Invalid option, going back to Main Menu... Please type in another option from 0-6");
                printMainMenu();
                break;
        }
    }
}

//Items menu

