import java.util.Scanner;

public class GuessNumberDoWhile {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		int nSecret = 57;
		int nIntents = 0;
		int num;
		
		do {
			System.out.println("Enter a number between 1 and 100: ");
			num = scanner.nextInt();
			nIntents++;
		
			if (num != nSecret) {
				if (num < 1) {
					System.out.println("At least 1!");
				} else if (num > 100) {
					System.out.println("At most 100!");
				} else if (num < nSecret) {
					System.out.println("It's greater than " + num);
				} else {
					System.out.println("It's smaller than " + num);
				
				}
			}
		
		} while (num != nSecret);
		
		System.out.println("You guessed it!");
		System.out.println("Attempts: " + nIntents);
	}
}