import java.util.Scanner;

public class SumUntilZero {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		int num = 0;
		int suma = 0;
		int count = 0;
		
		System.out.println("Enter number: ");
		num = scanner.nextInt();
		
		while (num != 0) {
			suma += num;
			count++;
			
			System.out.println("Enter number: ");
			num = scanner.nextInt();
		}
		
		System.out.println("Sum: " + suma);
		System.out.println("Count: " + count);
	}
}