import java.util.Scanner;

public class CountText {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter text to find: ");
		String textBase = scanner.nextLine();
		
		String input = "";
		int voltes = 0;
		int ordre = 0;
		int quantity = 0;
		
		while (voltes < 10) {
			ordre++;
			voltes++;
			System.out.printf("Enter text (%d): %n", ordre);
			input = scanner.nextLine();
						
			if (input.equalsIgnoreCase(textBase)) {
				quantity++;
			}
		}
		
		System.out.println("Count: " + quantity);
	}
}