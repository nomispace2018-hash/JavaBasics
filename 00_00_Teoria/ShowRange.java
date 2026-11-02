import java.util.Scanner;

public class ShowRange {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		int starting = 0;
		int ending = 0;
		
		System.out.println("Enter the starting number:");
		starting = scanner.nextInt();
		
		System.out.println("Enter the ending number:");
		ending = scanner.nextInt();
		
		while (ending <= starting) {
			System.out.println("Enter the ending number:");
			ending = scanner.nextInt();
		}
		
		for (int contar = starting; contar <= ending; contar++) {
			System.out.print(contar + " ");
		}
	}
}