import java.util.Scanner;

public class Scanner_Ex4 {
	public static void main(String [] args) {
		
		Scanner scanner;
        scanner = new Scanner(System.in);
		
		System.out.println("Enter 5 cities separated by spaces: ");
        String street1 = scanner.next();
		String street2 = scanner.next();
        String street3 = scanner.next();
        String street4 = scanner.next();
        String street5 = scanner.next();

		System.out.printf("Cities: %n%s%n%s%n%s%n%s%n%s", street1, street2, street3, street4, street5);
	
	}
}