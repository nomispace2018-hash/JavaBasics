import java.util.Scanner;

public class TravelTime {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Number of stops:");
		int stops = scanner.nextInt();
		
		System.out.println("Number of transfers:");
		int transfers = scanner.nextInt();
		
		final int timeStops = 3;
		final int timeTransfers = 6;
		
		int totalTrajecte = (stops * timeStops) + (transfers * timeTransfers);
		
		int tempsSec = totalTrajecte * 60;
		//Calcular hores
		int hores = tempsSec / 3600;
		//Calcular minuts
		int segonsRestants = tempsSec % 3600;
		int minuts = segonsRestants / 60;
		
		System.out.printf("Total traveling time is %02d:%02d%n", hores, minuts);
		
	}
}