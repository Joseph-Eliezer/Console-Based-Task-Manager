package errorHandling;

import java.util.Scanner;

public class intValidation {
    static Scanner scanner = new Scanner(System.in);
   public static int validateInput(String prompt, int min, int max) {
		int input;
		while (true) {
			System.out.print(prompt);
			while (!scanner.hasNextInt()) {
				System.out.println("Invalid, please enter a number");
				scanner.next();
				System.out.print("Choose: ");
			}
			input = scanner.nextInt();
			if (input >= min && input <= max) {
				break;
			} else {
				System.out.println("Invalid, please enter valid number");

			}
		}
		return input;
	}
}
