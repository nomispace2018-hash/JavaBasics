import java.util.Scanner;

public class SplitElectricityBill {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//DEMANAR DADES
		System.out.println("Number of people:");
		int people = scanner.nextInt();

		System.out.println("Enter electricity consumption (kWh):");
		double consumption = scanner.nextDouble();

		System.out.println("Enter price per kWh (€):");
		double price = scanner.nextDouble();

		System.out.println("Enter fixed monthly charge (€):");
		double fixedCharge = scanner.nextDouble();

		System.out.println("Enter tax (%):");
		double tax = scanner.nextDouble();

		//VARIABLES CÀLCUL
		double energyCost = consumption * price;
		System.out.printf("Energy cost = %.2f €", energyCost);
		System.out.printf("%nFixed charge = %.2f €", fixedCharge);
		double subtotal = energyCost + fixedCharge;
		System.out.printf("%nSubtotal = %.2f €", subtotal);
		double taxTotal = (subtotal * tax) / 100;
		System.out.printf("%nTax = %.2f €", taxTotal);
		double total = subtotal + taxTotal;
		System.out.printf("%nTotal = %.2f €", total);
		double totalXPerson = total / (double)people;
		System.out.printf("%nTotal per person = %.2f €", totalXPerson);
	}
}