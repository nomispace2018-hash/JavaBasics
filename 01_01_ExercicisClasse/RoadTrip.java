public class RoadTrip {
	public static void main(String[] args) {
		
		double distanceAnada = 347.8; //KM
		double distanceTotal = 347.8 * 2; //KM * anada i tornada
		double consum = 0.067; //litres * KM
		double consumTotal = 0.067 * distanceTotal; 
		double priceDiesel = 1.92;
		double totalDiesel = priceDiesel * consumTotal;
		int passatgers = 4;
		double peatgesAnada = 12.65;
		double peatgesTotal = peatgesAnada * 2;
		int menjarAnada = 30;
		double menjarTotal = 30 * 2;
		double preuParking = 18.5;
		double preuTotal = totalDiesel + peatgesTotal + menjarTotal + preuParking;
		double preuPassatger = preuTotal / 4;
		
		String header = "=========== ROAD TRIP ===========";
		String divider = "---------------------------------";
		String capçalera = "=================================";

		System.out.printf("%S", header);
		System.out.printf("%nRound trip distance: %9.2f km", distanceTotal);
		System.out.printf("%n%s", divider);
		System.out.printf("%nFuel needed: %17.2f L", consumTotal);
		System.out.printf("%nFuel cost: %19.2f €",totalDiesel);
		System.out.printf("%n%s", divider);
		System.out.printf("%nTolls: %23.2f €", peatgesTotal);
		System.out.printf("%nParking price: %15.2f €", preuParking);
		System.out.printf("%nFood: %24.2f €", menjarTotal);
		System.out.printf("%n%s", divider);
		System.out.printf("%nTotal trip cost: %13.2f €", preuTotal);
		System.out.printf("%nPassengers: %18d", passatgers);
		System.out.printf("%nCost per passenger: %10.2f €", preuPassatger);
		System.out.printf("%n%s", capçalera);

	}
}