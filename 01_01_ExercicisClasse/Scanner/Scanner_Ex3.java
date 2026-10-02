import java.util.Scanner;

public class Scanner_Ex3 {
	public static void main(String [] args) {
		
		Scanner scanner;
        scanner = new Scanner(System.in);
		
		System.out.println("Enter street number: ");
        int street = scanner.nextInt();
		
		System.out.println("Enter street name: ");
        String streetName = scanner.next(); //Ponemos el scanner.next (sin el LINE) para que no nos omita las respuestas.
		
		System.out.println("Enter city: ");
		String city = scanner.next();

		System.out.println("Enter country: ");
		String country = scanner.next();
		
		System.out.println("Enter postal code: ");
		String postal = scanner.next();
		
		System.out.printf("%nYour address is: %n%d %s%n%s%n%s%n%s", street, streetName, city, postal, country);
	}
}
