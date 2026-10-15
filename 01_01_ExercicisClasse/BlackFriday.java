import java.util.Scanner;

public class BlackFriday {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the price:");
		double price = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Do you have a loyalty card? (yes/no):");
		String loyalty = scanner.nextLine();
		
		if (loyalty.equalsIgnoreCase("yes")) { //SI
			if (price > 60) {
				double discount = price * 0.20;
				double finalPrice = price - discount;
				System.out.printf("Final price: %.2f €", finalPrice);
			} else {
				double discount = price * 0.05;
				double finalPrice = price - discount;
				System.out.printf("Final price: %.2f €", finalPrice);
			}
		} else { //NO
			if (price > 60) {
				double discount = price * 0.10;
				double finalPrice = price - discount;
				System.out.printf("Final price: %.2f €", finalPrice);
			} else {
				System.out.printf("Final price: %.2f €", price);
			}		
		}
		
	}
}