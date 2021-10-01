package utilities;

import java.util.Scanner;

public class UserInput {

    private static final Scanner scanner = new Scanner(System.in);

    public static int readInt() {
        return scanner.nextInt();
    }

    public static String readInput() {
    return scanner.nextLine();
    }

}
