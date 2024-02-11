package errorHandling;

import java.util.Scanner;

public class stringValidation {
    static Scanner scanner = new Scanner(System.in);
   public static String validateInputString(String prompt) {
		String input;
		while (true) {
			System.out.print(prompt);
			while (scanner.hasNextInt()) {
				System.out.println("Invalid , please enter a Character: ");
				scanner.next();
				System.out.print("Choose: ");
			}
			
			if (scanner.hasNext()) {
				input = scanner.nextLine();
				break;
			} else {
				System.out.println("Invalid, enter y/n ");

			}

		}
		return input;
	}
}
