package menus;
import utilities.UserInput;
public class TransactionHistoryOptions {

        public static void printTransactionsHistoryOptions(){
            System.out.println("Transaction History options menu:\n" +
                    "\n" +
                    "0. Return to Main Menu.\n" +
                    "1. Print total profit from all item purchases\n" +
                    "2. Print total units sold from all item purchases\n" +
                    "3. Print the total number of item transactions made.\n" +
                    "4. Print all transactions made.\n" +
                    "5. Print the total profit of a specific item.\n" +
                    "6. Print the number of units sold of a specific item.\n" +
                    "7. Print all transactions of a specific item.\n" +
                    "8. Print item with highest profit.\n" +
                    "\n" +
                    "Type an option number:\n" +
                    "\n");

            String userInput = UserInput.readInput();
            switch (userInput){
                case "0":
                    System.out.println("Here are your Main Menu");
                    MainMenu.printMainMenu();
                    break; //Link to Main Menu

                case "1":
                    System.out.println("The total profit is +(total profit");
                    //add total profit
                    break;

                case "2":
                    System.out.println("A total of (total units sold) is sold.");
                    //insert total units sold
                    break;

                case "3":
                    System.out.println("A total of (number of transactions) is made.");
                    //insert total number of item transactions
                    break;
                case "4":
                    System.out.println("A total of (number of item transactions) item transactions is made.");
                    //insert total number of transactions
                    break;

                case "5":
                    System.out.println("The profit for (item +s) is (number) kronor.");
                    //add the total sum of a specific item
                    break;

                case "6":
                    System.out.println("A total of (number) of (item) ");
                    //add the total sum of a specific item
                    break;

                case "7":
                    System.out.println("Transactions for (item: ");
                    //List all transactions of a specific item
                    break;

                case "8":
                    System.out.println("(Item) has the highest profit");
                    //Find item with highest profit.
                    break;

                default:
                    System.out.println("Invalid menu option. Please type another option");
                    break;
            }
        }
    }
