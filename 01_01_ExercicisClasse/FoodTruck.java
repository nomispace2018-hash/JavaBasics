import java.util.Scanner;

public class FoodTruck {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//VARIABLES
		double basePrice, friesPrice, saucePrice, toppingPrice, drinkPrice;
		double total = 0; 
		double totalAll = 0;
		boolean hasError =  false;
		
		System.out.println("Enter your choice (burger/tacos/pizza):");
		String choice = scanner.nextLine();
		String choiceLower = choice.toLowerCase();
		
		if (choiceLower.equals("burger") || choiceLower.equals("tacos") || choiceLower.equals("pizza")) {		
			switch (choiceLower) {
				case "burger":
					basePrice = 10.50;
					System.out.println("Fries size? (large/small):");
					String size = scanner.nextLine();
					
					if (size.equalsIgnoreCase("large") || size.equalsIgnoreCase("small")) {
						friesPrice = switch (size.toLowerCase()) {
							case "large" -> 4.50;
							case "small" -> 3.75;
							default -> 0.0;
						};
						total = basePrice + friesPrice;
					} else {
						System.out.println("Invalid choice");
						hasError = true;
					}	
					break;
				
				case "tacos":
					basePrice = 8.50;
					System.out.println("Sauce? (cheese/guacamole):");
					String sauce = scanner.nextLine();
					
					if (sauce.equalsIgnoreCase("cheese") || sauce.equalsIgnoreCase("guacamole")) {
						saucePrice = switch (sauce.toLowerCase()) {
							case "cheese" -> 2.50;
							case "guacamole" -> 2.60;
							default -> 0.0;
						};
						total = basePrice + saucePrice;
					} else {
                        System.out.println("Invalid choice");
                        hasError = true;
                    }
                    break;
					
				case "pizza":
					basePrice = 12.50;
					System.out.println("Topping? (pepperoni/carbonara):");
					String topping = scanner.nextLine();
					
					if (topping.equalsIgnoreCase("pepperoni") || topping.equalsIgnoreCase("carbonara")) {
						toppingPrice = switch (topping.toLowerCase()) {
							case "pepperoni" -> 3.50;
							case "carbonara" -> 3.30;
							default -> 0.0;
						};
						total = basePrice + toppingPrice;
					} else {
						System.out.println("Invalid choice");
                        hasError = true;
					}
					break;
			}
			
			if (!hasError) {
				System.out.println("Choose your drink (soft/beer/water):");
				String drink = scanner.nextLine();
				String drinkLower = drink.toLowerCase();
				
				if (drinkLower.equalsIgnoreCase("soft") || drinkLower.equalsIgnoreCase("beer") || drinkLower.equalsIgnoreCase("water")) {
					drinkPrice = switch (drinkLower) {
						case "soft" -> 3.50;
						case "beer" -> 5.50;
						case "water" -> 2.20;
						default -> 0.0;
					};
					
					totalAll = total + drinkPrice;
					System.out.printf("Total: %.2f €%n", totalAll);
				} else {
					System.out.println("Invalid choice");
				}
			}
		} else {
            System.out.println("Invalid choice");
        }
	}
}
				