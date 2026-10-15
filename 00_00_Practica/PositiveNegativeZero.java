import java.util.Scanner;

public class PositiveNegativeZero {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int integer = scanner.nextInt();
		
		if (integer == 0) {
			System.out.println("The number " + integer + " is zero");
		} else if (integer >= 1) {
			System.out.println("The number " + integer + " is positive");
		} else {
			System.out.println("The number " + integer + " is negative");
		}
	}
}