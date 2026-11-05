import java.util.Scanner;

public class RepeatFor {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		int num = 0;
		
		System.out.println("How many times?");
		num = scanner.nextInt();
		
		while (num <= 0) {
			System.out.println("How many times?");
			num = scanner.nextInt();
		}
		
		for (int i = 0; i < num; i++) {
			System.out.println("Java is fun!");
		}
	}
}