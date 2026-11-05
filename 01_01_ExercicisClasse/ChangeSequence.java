	import java.util.Scanner;

	public class ChangeSequence {
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			//Variables
			int starting = 0;
			int ending = 0;
			int operacio = 0;
			
			System.out.println("Enter the starting number: ");
			starting = scanner.nextInt();
			
			System.out.println("Enter the ending number: ");
			ending = scanner.nextInt();
			
			while (ending <= starting) {
				System.out.println("Enter the ending number: ");
				ending = scanner.nextInt();
			}
			
			for (int i = starting; i <= ending; i++) {
				if (i % 2 == 0) {
					operacio = i * 2;
					System.out.print(operacio + " ");
				} else {
					operacio = i / 2;
					System.out.print(operacio + " ");
				}
			}
		}
	}