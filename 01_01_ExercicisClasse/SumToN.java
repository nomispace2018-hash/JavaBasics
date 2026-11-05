import java.util.Scanner;

public class SumToN {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		int num = 0;
		int suma = 0;
		int numOriginal = 0;
		
		System.out.println("Enter a number (greater than 1):");
		num = scanner.nextInt(); //10
		
		while (num <= 1) {
			System.out.println("Enter a number (greater than 1):");
			num = scanner.nextInt();
		}
		
		numOriginal = num;
		
		for (int i = 1; i <= numOriginal; i++) { 
			suma = suma + num; //0+9
			num--; //9
		}
		
		System.out.println("Sum = " + suma);
		
	}
}