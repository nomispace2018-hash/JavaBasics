import java.util.Scanner;

public class CountNumber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = scanner.nextInt();
		int counter = 1;
		int counter5 = 0;
		
		if (num == 5) {
			counter5++;
		}
		
		while (counter < 10) {
			System.out.println("Enter number: ");
			num = scanner.nextInt();
			
			counter++;
			
			if (num == 5) {
				counter5++;
			}
		}
		
		System.out.println("Count: " + counter5);
		
	}
}