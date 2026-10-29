import java.util.Scanner;

public class GuessNumberWhile {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		int secret = 52;
		int guess = 0;
		int attempts = 0;
		
		System.out.println("Enter a number between 1 and 100: ");
		guess = scanner.nextInt();
		
		while (guess != secret) {
			if (guess < 1) {
				System.out.println("At least 1!");
			}
			
			if (guess > 100) {
				System.out.println("At most 100!");
			}
			
			if (guess < secret && guess >= 1) {
				System.out.println("It's greater than " + guess);
			}
			
			if (guess > secret && guess <= 100) {
				System.out.println("It's smaller than " + guess);
			}
			
			attempts++;
			System.out.println("Enter a number between 1 and 100: ");
			guess = scanner.nextInt();
		}
		
		if (guess == secret) {
			System.out.println("You guessed it!");
			attempts++;
			System.out.println("Attempts: " + attempts);
		}
	}
}