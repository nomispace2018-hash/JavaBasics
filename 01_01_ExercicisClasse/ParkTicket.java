import java.util.Scanner;

public class ParkTicket {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your age:");
		int age = scanner.nextInt();
		
		System.out.println("Is it a weekday? (true/false)");
		boolean weekday = scanner.nextBoolean();
		
		String text2 = (age >= 12 && weekday == true) ? ("Ticket price: 15.00 €") : ("Ticket price: 22.00 €");
		
		String text = (age < 12 && weekday == true) ? ("Ticket price: 5.00 €") : (age < 12 && weekday == false) ? ("Ticket price: 9.00 €") : text2;
		
		System.out.println(text);
		
	}
}