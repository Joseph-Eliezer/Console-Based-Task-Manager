package errorHandling;

import java.util.Scanner;
public class YorNvalidation {
    static Scanner scanner = new Scanner(System.in);
    public static String validateInputStringYorN(String prompt) {
        String input;
        while (true) {
        System.out.print(prompt);
        while (scanner.hasNextInt()) {
        System.out.println(" Invalid , please enter a Character: ");
        scanner.next();
        System.out.print(" Choose: ");
        }
        input = scanner.next();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n")) {
        break;
        } else {
        System.out.println(" Invalid, enter y/n ");
        
                    }
        
                }
                return input;
            }
}
