import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		int num = 0;
		int ultimDigit = 0;
		int invertit = 0;
		int nombreOriginal = 0;
		int digits = 0;
		
		System.out.println("Enter a positive number: ");
		num = scanner.nextInt();
		nombreOriginal = num;
		
		while (num > 0) {
			ultimDigit = num % 10;
			invertit = (invertit * 10) + ultimDigit;
			num = num / 10;
			digits++;
		}
		
		if ((invertit == nombreOriginal) && (digits >= 5 && digits <= 7)) {
			System.out.println("Valid code");
		} else {
			System.out.println("Invalid code");
		}
	}
}