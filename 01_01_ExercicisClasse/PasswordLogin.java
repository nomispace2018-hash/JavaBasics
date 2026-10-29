import java.util.Scanner;

public class PasswordLogin {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		String contrasenya = "";
		int attempts = 0;
		
		System.out.println("Enter the password: ");
		contrasenya = scanner.nextLine();
		
		while (!contrasenya.equals("Qwert?9876")) {
			attempts++;
			System.out.println("Incorrect, try again: ");
			contrasenya = scanner.nextLine();
		}
		
		System.out.println("Access granted!");
		attempts++;
		System.out.println("Attempts: " + attempts);
	}
}