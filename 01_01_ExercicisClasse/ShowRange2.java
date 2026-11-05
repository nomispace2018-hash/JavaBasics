import java.util.Scanner;

public class ShowRange2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		int starting = 0;
		int ending = 0;
		
		System.out.println("Enter the starting number: "); //5 (viceversa, seria 10)
		starting = scanner.nextInt();
		
		System.out.println("Enter the ending number: "); //10 (viceversa, seria 5)
		ending = scanner.nextInt();
		
		while (ending == starting) {
			System.out.println("Enter the ending number: ");
			ending = scanner.nextInt();
		}
		
		if (ending > starting) { //10 > 5
			for (int i = starting; i <= ending; i++) {
				System.out.print(i + " ");
			}
		} else { //starting > ending
			for (int i = starting; i >= ending; i--) {
				System.out.print(i + " " );
			}
		}
	}
}