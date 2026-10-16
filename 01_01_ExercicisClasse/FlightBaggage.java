import java.util.Scanner;

public class FlightBaggage {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String fareType;
		double baggageWeight;
		double baggageWeightPlus;
		double baggageLength;
		double baggageWidth;
		double baggageHeight;
		double sumaDimensions;
		double totalAdicional;
		
		System.out.println("Enter fare type (Basic/Flex):");
		fareType = scanner.nextLine();
		
		System.out.println("Enter baggage weight (kg):");
		baggageWeight = scanner.nextDouble();
		
		System.out.println("Enter baggage length (cm):");
		baggageLength = scanner.nextDouble();
					
		System.out.println("Enter baggage width (cm):");
		baggageWidth = scanner.nextDouble();
				
		System.out.println("Enter baggage height (cm):");
		baggageHeight = scanner.nextDouble();
				
		sumaDimensions = baggageLength + baggageWidth + baggageHeight;
		
		if (fareType.equalsIgnoreCase("basic") || fareType.equalsIgnoreCase("flex")) {	
			if (fareType.equalsIgnoreCase("basic")) {
				if (baggageWeight > 0 && baggageWeight <= 20) {
					baggageWeightPlus = 0;
					
				} else if (baggageWeight > 20 && baggageWeight <= 32) {
					baggageWeightPlus = ((int)baggageWeight - 20) * 10;
			
				} else {
					baggageWeightPlus = (((int)baggageWeight - 20) * 10) + 35;
				}
			
			} else {
				if (baggageWeight > 0 && baggageWeight <= 25) {
					baggageWeightPlus = 0;
				
				} else if (baggageWeight > 25 && baggageWeight <= 32) {
					baggageWeightPlus = ((int)baggageWeight - 25) * 10;
				
				} else {
					baggageWeightPlus = (((int)baggageWeight - 25) * 10) + 35;
				}
			}
				
			if (sumaDimensions > 158) {
				totalAdicional = 35 + baggageWeightPlus;
			} else {
				totalAdicional = 0 + baggageWeightPlus;
			}
					
			System.out.printf("Extra baggage cost: %.2f €", totalAdicional);
		} else {
			System.out.println("Invalid data");
		}
	}
}