import java.util.Scanner;

public class GymMembership {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Benvinguts a 'GoGym'!");
		System.out.println("A continuació et oferim les quotes disponibles i opciones de subscripció.");
		
		System.out.println("One Gym: permet l'accès a un únic gimnàs de la cadena i té un preu de 24.90 € al mes.");
		System.out.println("Multi Gym: permet l'accès a tots els gimnasos de la cadena i té un preu de 34.90 € al mes.");
		System.out.println("Quina quota vols seleccionar? (1/2)");
		int quota = scanner.nextInt();
		scanner.nextLine();
		
		double preuMensual = 0;
		double inscripcioFee = 12.50;
		boolean opcioValida = true;
		
		// 1. Selecció de Quota
		if (quota == 1) {
			preuMensual = 24.90;
			System.out.println("Has seleccionat la quota 'One Gym'.");
		} else if (quota == 2) {
			preuMensual = 34.90;
			System.out.println("Has seleccionat la quota 'Multi Gym'.");
			
			// 2. Selecció d'Horari
			System.out.println("Al seleccionar aquesta quota, pots seleccionar el teu horari d'accès.");
			System.out.println("Mornings (06:00-12:00): sense recàrrec.");
			System.out.println("All Day: +7.50 € al mes");
			System.out.println("Quin horari voldràs? (1/2)");
			int horari = scanner.nextInt();
			scanner.nextLine();
			
			if (horari == 1) {
				System.out.println("Has escollit horari de matins.");
			} else if (horari == 2) {
				preuMensual += 7.50;
				System.out.println("Has escollit horari All Day.");
			} else {
				System.out.println("Invalid option");
				opcioValida = false;
			}
			
			// 3. Piscina i Sauna (Només si l'opció anterior és vàlida)
			if (opcioValida) {
				System.out.println("També oferim accès a la piscina i sauna: +9.90 € al mes.");
				System.out.println("El vols? (si/no)");
				String piscina = scanner.nextLine();
				
				if (piscina.equalsIgnoreCase("si")) {
					preuMensual += 9.90;
					
					// 4. Armariet (Locker)
					System.out.println("Vols contractar també un armariet (locker) per 9.90€ al mes? (si/no)");
					String locker = scanner.nextLine();
					
					if (locker.equalsIgnoreCase("si")) {
						preuMensual += 9.90;
						System.out.println("Has contractat un locker.");
					} else if (!locker.equalsIgnoreCase("no")) {
						System.out.println("Invalid option");
						opcioValida = false;
					}
				} else if (!piscina.equalsIgnoreCase("no")) {
					System.out.println("Invalid option");
					opcioValida = false;
				}
			}
		} else {
			System.out.println("Invalid option");
			opcioValida = false;
		}
		
		// 5. Descompte per Amic i Càlculs Finals (Només si tot és vàlid)
		if (opcioValida) {
			System.out.println("T'ha recomenat un amic? Indica-ho! (si/no)");
			String amic = scanner.nextLine();
			
			double descompte = 0;
			if (amic.equalsIgnoreCase("si")) {
				System.out.println("Has obtingut un 10% de descompte!");
				descompte = preuMensual * 0.10;
			} else if (!amic.equalsIgnoreCase("no")) {
				System.out.println("Invalid option");
				opcioValida = false;
			}
			
			if (opcioValida) {
				double preuMensualFinal = preuMensual - descompte;
				double preu1rMes = preuMensualFinal + inscripcioFee;
				
				// Mostrem els resultats exactes demanats per l'enunciat
				System.out.println("\n--- RESUM DE LA FACTURA ---");
				System.out.printf("Preu mensual: %.2f €%n", preuMensual);
				System.out.printf("Descompte: %.2f €%n", descompte);
				System.out.printf("Preu mensual final: %.2f €%n", preuMensualFinal);
				System.out.printf("Quota d'inscripció: %.2f €%n", inscripcioFee);
				System.out.printf("Preu total del primer mes: %.2f €%n", preu1rMes);
			}
		}
		
		scanner.close();
	}
}