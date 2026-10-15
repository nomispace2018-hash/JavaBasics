public class RoadTrip {
	public static void main(String[] args) {
		
		String header = "=========== Road Trip ===========";
		String divider = "---------------------------------";
		String footer = "=================================";
		
		double distanceTotal = 347.8 * 2; //KM
		double fuel = 0.067 * distanceTotal; //Litres
		double fuelPrice = 1.92 * fuel; //€
		double tolls = 12.65 * 2; //€
		double parking = 18.5; //€
		double food = 30 * 2; //€
		double totalTrip = fuelPrice + tolls + parking + food;
		int people = 4;
		double personPrice = totalTrip / (double)people;
		
		System.out.printf("%S", header);
		System.out.printf("%nRound trip distance: %9.2f km", distanceTotal);
		System.out.printf("%n%s", divider);
		System.out.printf("%nFuel needed: %17.2f L", fuel);
		System.out.printf("%nFuel cost: %19.2f €", fuelPrice);
		System.out.printf("%n%s", divider);
		System.out.printf("%nTolls: %23.2f €", tolls);
		System.out.printf("%nParking price: %15.2f €", parking);
		System.out.printf("%nFood: %24.2f €", food);
		System.out.printf("%n%s", divider);
		System.out.printf("%nTotal trip cost: %13.2f €", totalTrip);
		System.out.printf("%nPassengers: %20d", people);
		System.out.printf("%nCost per passenger: %10.2f €", personPrice);
		System.out.printf("%n%s", footer);
		
		
	}
}