import java.util.Scanner;

public class PasswordCheck {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String password = "jupiter4321";
		System.out.println("Enter your password:");
		String input = scanner.nextLine();
		
		if (input.equals(password)) {
			System.out.println("Access granted. Welcome!");
		} else {
			System.out.println("Incorrect password. Try again.");
			System.out.println("Enter your password:");
			input = scanner.nextLine();
			
			if (input.equals(password)) {
					System.out.println("Access granted. Welcome!");
			} else {
				System.out.println("Incorrect password. Try again.");
				System.out.println("Enter your password:");
				input = scanner.nextLine();
					
				if (input.equals(password)) {
					System.out.println("Access granted. Welcome!");
				} else {
					System.out.println("Your account is locked. Please contact your administrator.");	
				}
			}
		}
		
	}
}