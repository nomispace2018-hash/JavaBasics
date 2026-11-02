import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		int entrada = 0;
		int ultimDigit = 0;
		String numInvertit = "";
		
		System.out.println("Enter number > 0: ");
		entrada = scanner.nextInt();
		
		while (entrada <= 0) {
			System.out.println("Enter number > 0: ");
			entrada = scanner.nextInt();
		}
		
		while (entrada > 0) {
			ultimDigit = entrada % 10;
			numInvertit += ultimDigit; //El mateix que "numInvertit = numInvertit + ultimDigit;
			entrada = entrada / 10;
		}
		
		System.out.println(numInvertit);
	}
}