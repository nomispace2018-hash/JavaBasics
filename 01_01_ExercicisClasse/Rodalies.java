import java.util.Scanner;

public class Rodalies {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String header = "=== PREU BITLLET DE RODALIES ===";
		String error1 = "Error: l'opció seleccionada no és vàlida";
		String error2 = "Error: les zones han d'estar entre 1 i 6";
		int tipus;
		int quantZones;
		String tipus1 = "1. Bitllet senzill";
		String tipus2 = "2. Anada i tornada";
		String tipus3 = "3. Bonotren de 10 viatges";
		String tipus4 = "4. Abonament mensual";
		
		//ESCOLLIR ZONA ORIGEN + DESTI
		System.out.println(header);
		System.out.println("Zona d'origen:");
		int zonaOrigen = scanner.nextInt();
		System.out.println("Zona de destí:");
		int zonaDesti = scanner.nextInt();
		
		if ((zonaOrigen >=1 && zonaOrigen <=6) && (zonaDesti >=1 && zonaDesti <=6)) {
			quantZones = Math.abs(zonaDesti - zonaOrigen) + 1;
			
			System.out.println("Tipus de transport:");
			System.out.println(tipus1);
			System.out.println(tipus2);
			System.out.println(tipus3);
			System.out.println(tipus4);
			
			System.out.println("Escull una opció:");
			tipus = scanner.nextInt();

			if (tipus == 1) {
				System.out.println("Zones del trajecte: " + quantZones);
				if (quantZones == 1) {
					System.out.println("Preu: 2.90 €");
				} else if (quantZones == 2) {
					System.out.println("Preu: 3.35 €");
				} else if (quantZones == 3) {
					System.out.println("Preu: 4.55 €");
				} else if (quantZones == 4) {
					System.out.println("Preu: 5.55 €");
				} else if (quantZones == 5) {
					System.out.println("Preu: 6.60 €");
				} else {
					System.out.println("Preu: 8.25 €");
				}
			} else if (tipus == 2) {
				System.out.println("Zones del trajecte: " + quantZones);
				if (quantZones == 1) {
					System.out.println("Preu: 5.80 €");
				} else if (quantZones == 2) {
					System.out.println("Preu: 6.70 €");
				} else if (quantZones == 3) {
					System.out.println("Preu: 9.10 €");
				} else if (quantZones == 4) {
					System.out.println("Preu: 11.00 €");
				} else if (quantZones == 5) {
					System.out.println("Preu: 13.20 €");
				} else {
					System.out.println("Preu: 16.50 €");
				}
			} else if (tipus == 3) {
				System.out.println("Zones del trajecte: " + quantZones);
				if (quantZones == 1) {
					System.out.println("Preu: 11.70 €");
				} else if (quantZones == 2) {
					System.out.println("Preu: 18.60 €");
				} else if (quantZones == 3) {
					System.out.println("Preu: 27.60 €");
				} else if (quantZones == 4) {
					System.out.println("Preu: 35.80 €");
				} else if (quantZones == 5) {
					System.out.println("Preu: 43.45 €");
				} else {
					System.out.println("Preu: 54.40 €");
				}
			} else if (tipus == 4) {
				System.out.println("Zones del trajecte: " + quantZones);
				if (quantZones == 1) {
					System.out.println("Preu: 22.50 €");
				} else if (quantZones == 2) {
					System.out.println("Preu: 35.45 €");
				} else if (quantZones == 3) {
					System.out.println("Preu: 52.50 €");
				} else if (quantZones == 4) {
					System.out.println("Preu: 67.54 €");
				} else if (quantZones == 5) {
					System.out.println("Preu: 79.90 €");
				} else {
					System.out.println("Preu: 83.25 €");
				}
			} else {
				System.out.println(error1);
			}
		} else {
			System.out.println(error2);
		} 
	}
}