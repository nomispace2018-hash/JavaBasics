import java.util.Scanner;

public class GymMembership {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//ENTRADA
		System.out.println("Benvinguts a 'GoGym'!");
		System.out.println("A continuació et oferim les quotes disponibles i opciones de subscripció.");
		
		//Quotes
		System.out.println("One Gym: permet l'accpes a un únic gimnàs de la cadena i té un preu de 24.90 € al mes.");
		System.out.println("Multi Gym: permet l'accès a tots els gimnasos de la cadena i té un preu de 34.90 € al mes.");
		System.out.println("Quina quota vols seleccionar? (1/2)");
		int quota = scanner.nextInt();
		scanner.nextLine();
		//One Gym
		if (quota == 1) {
			System.out.println("Has seleccionat la quota 'One Gym'.");
			double preuQuota = 24.90;
			
			System.out.println("Per seu nou, hauràs de pagar una quota d'inscripció (registration fee) de 12.50 € el primer mes.");
			double inscripcioFee = 12.50;
			
			//Recomenació Amic
			System.out.println("T'ha recomenat un amic? Indica-ho! (si/no)");
			String amic = scanner.nextLine();
			
			if (amic.equalsIgnoreCase("si")) { //SI
				System.out.println("Has obtingut un 10% de descompte!");
				double descompte = preuQuota * 0.10;
				double preuTotal = preuQuota - descompte;
				double preu1rMes = preuTotal + inscripcioFee;
				System.out.printf("%nEl preu total del primer mes és de: %.2f.", preu1rMes);
				System.out.printf("%nEl preu mensual amb el descompte és de: %.2f.", preuTotal);
			} else if (amic.equalsIgnoreCase("no")) { //NO
				double preu1rMes = preuQuota + inscripcioFee;
				System.out.printf("%nEl preu total del primer mes és de: %.2f.", preu1rMes);
				System.out.printf("%nEl preu mensual és de: %.2f.", preuQuota);
			} else { //OTRO VALOR
				System.out.println("Invalid option.");
			}
		//Multi Gym	
		} else if (quota == 2) {
			double preuQuota = 34.90;
			System.out.printf("Has seleccionat la quota 'Multi Gym' de %.2f.", preuQuota);
			
			double inscripcioFee = 12.50;
			System.out.printf("Per seu nou, hauràs de pagar una quota d'inscripció (registration fee) de %.2f € el primer mes.", inscripcioFee);
			
			//Seleccionar horari
			System.out.println("Al seleccionar aquesta quota, pots seleccionar el teu horari d'accès.");
			System.out.println("Mornings (06:00-12:00): sense recàrrec.");
			System.out.println("All Day: +7.50 € al mes");
			
			System.out.println("Quin horari voldràs? (1/2)");
			int horari = scanner.nextInt();
			scanner.nextLine();
			
			//Mornings
			if (horari == 1) {
				System.out.println("Has escollit horari de 09:00-12:00.");
				
				//Piscina i sauna
				System.out.println("També oferim accès a la piscina i sauna: +9.90 € al mes.");
				System.out.println("El vols? (si/no)");
				String piscina = scanner.nextLine();
				
				if (piscina.equalsIgnoreCase("si")) { //SI PISCINA
					double preuPiscina = 9.90;
					
					//Armariet
					System.out.println("Vols contractar també un armariet (locker) per 9.90€ al mes? (si/no)");
					String locker = scanner.nextLine();
					
					if (locker.equalsIgnoreCase("si")) { //SI ARMARI
						System.out.println("Has contractar un locker.");
						double preuLocker = 9.90;
						
						//Recomenació Amic
						System.out.println("T'ha recomenat un amic? Indica-ho! (si/no)");
						String amic = scanner.nextLine();
			
						if (amic.equalsIgnoreCase("si")) { //SI AMIC
							System.out.println("Has obtingut un 10% de descompte!");
							double preuBase = preuPiscina + preuLocker + preuQuota;
							double descompte = preuBase * 0.10;
							double preuTotal = preuBase - descompte;
							double preu1rMes = preuTotal + inscripcioFee;
							System.out.printf("%nEl preu total del primer mes és de: %.2f.", preu1rMes);
							System.out.printf("%nEl preu mensual amb el descompte és de: %.2f.", preuTotal);
						} else if (amic.equalsIgnoreCase("no")) { //NO AMIC
							double preuBase = preuPiscina + preuLocker + preuQuota;
							double preu1rMes = preuBase + inscripcioFee;
							System.out.printf("%nEl preu total del primer mes és de: %.2f.", preu1rMes);
							System.out.printf("%nEl preu mensual és de: %.2f.", preuBase);
						} else { //OTRO VALOR
							System.out.println("Invalid option.");
						}
					} else if (locker.equalsIgnoreCase("no")) { //NO ARMARI
						//Recomenació Amic
						System.out.println("T'ha recomenat un amic? Indica-ho! (si/no)");
						String amic = scanner.nextLine();
			
						if (amic.equalsIgnoreCase("si")) { //SI AMIC
							System.out.println("Has obtingut un 10% de descompte!");
							double preuBase = preuPiscina + preuQuota;
							double descompte = preuBase * 0.10;
							double preuTotal = preuBase - descompte;
							double preu1rMes = preuTotal + inscripcioFee;
							System.out.printf("%nEl preu total del primer mes és de: %.2f.", preu1rMes);
							System.out.printf("%nEl preu mensual amb el descompte és de: %.2f.", preuTotal);
						} else if (amic.equalsIgnoreCase("no")) { //NO AMIC
							double preuBase = preuPiscina + preuQuota;
							double preu1rMes = preuBase + inscripcioFee;
							System.out.printf("%nEl preu total del primer mes és de: %.2f.", preu1rMes);
							System.out.printf("%nEl preu mensual és de: %.2f.", preuBase);
						} else { //OTRO VALOR
							System.out.println("Invalid option.");
						}
					}
				} else if (piscina.equalsIgnoreCase("no")) { //NO PISCINA
					//Recomenació Amic
					System.out.println("T'ha recomenat un amic? Indica-ho! (si/no)");
					String amic = scanner.nextLine();
			
					if (amic.equalsIgnoreCase("si")) { //SI AMIC
						System.out.println("Has obtingut un 10% de descompte!");
						double descompte = preuQuota * 0.10;
						double preuTotal = preuQuota - descompte;
						double preu1rMes = preuTotal + inscripcioFee;
						System.out.printf("%nEl preu total del primer mes és de: %.2f.", preu1rMes);
						System.out.printf("%nEl preu mensual amb el descompte és de: %.2f.", preuTotal);
					} else if (amic.equalsIgnoreCase("no")) { //NO AMIC
						double preu1rMes = preuQuota + inscripcioFee;
						System.out.printf("%nEl preu total del primer mes és de: %.2f.", preu1rMes);
						System.out.printf("%nEl preu mensual és de: %.2f.", preuQuota);
					} else { //OTRO VALOR
						System.out.println("Invalid option.");
					}
				} else { //OTRO VALOR
						System.out.println("Invalid option.");
				}
			//All Day
			} else if (horari == 2) {
				double allDay = 7.50;
				System.out.printf("Has escollit tot el dia per %.2f.", allDay);
				
				//Piscina i sauna
				System.out.println("També oferim accès a la piscina i sauna: +9.90 € al mes.");
				System.out.println("El vols? (si/no)");
				String piscina = scanner.nextLine();
				
				if (piscina.equalsIgnoreCase("si")) { //SI PISCINA
					double preuPiscina = 9.90;
					
					//Armariet
					System.out.println("Vols contractar també un armariet (locker) per 9.90€ al mes? (si/no)");
					String locker = scanner.nextLine();
					
					if (locker.equalsIgnoreCase("si")) { //SI ARMARI
						System.out.println("Has contractar un locker.");
						double preuLocker = 9.90;
						
						//Recomenació Amic
						System.out.println("T'ha recomenat un amic? Indica-ho! (si/no)");
						String amic = scanner.nextLine();
			
						if (amic.equalsIgnoreCase("si")) { //SI AMIC
							System.out.println("Has obtingut un 10% de descompte!");
							double preuBase = preuPiscina + preuLocker + preuQuota + allDay;
							double descompte = preuBase * 0.10;
							double preuTotal = preuBase - descompte;
							double preu1rMes = preuTotal + inscripcioFee;
							System.out.printf("%nEl preu total del primer mes és de: %.2f.", preu1rMes);
							System.out.printf("%nEl preu mensual amb el descompte és de: %.2f.", preuTotal);
						} else if (amic.equalsIgnoreCase("no")) { //NO AMIC
							double preuBase = preuPiscina + preuLocker + preuQuota + allDay;
							double preu1rMes = preuBase + inscripcioFee;
							System.out.printf("%nEl preu total del primer mes és de: %.2f.", preu1rMes);
							System.out.printf("%nEl preu mensual és de: %.2f.", preuBase);
						} else { //OTRO VALOR
							System.out.println("Invalid option.");
						}
					} else if (locker.equalsIgnoreCase("no")) { //NO ARMARI
						//Recomenació Amic
						System.out.println("T'ha recomenat un amic? Indica-ho! (si/no)");
						String amic = scanner.nextLine();
			
						if (amic.equalsIgnoreCase("si")) { //SI AMIC
							System.out.println("Has obtingut un 10% de descompte!");
							double preuBase = preuPiscina + preuQuota + allDay;
							double descompte = preuBase * 0.10;
							double preuTotal = preuBase - descompte;
							double preu1rMes = preuTotal + inscripcioFee;
							System.out.printf("%nEl preu total del primer mes és de: %.2f.", preu1rMes);
							System.out.printf("%nEl preu mensual amb el descompte és de: %.2f.", preuTotal);
						} else if (amic.equalsIgnoreCase("no")) { //NO AMIC
							double preuBase = preuPiscina + preuQuota + allDay;
							double preu1rMes = preuBase + inscripcioFee;
							System.out.printf("%nEl preu total del primer mes és de: %.2f.", preu1rMes);
							System.out.printf("%nEl preu mensual és de: %.2f.", preuBase);
						} else { //OTRO VALOR
							System.out.println("Invalid option.");
						}
					}
				} else if (piscina.equalsIgnoreCase("no")) { //NO PISCINA
					//Recomenació Amic
					System.out.println("T'ha recomenat un amic? Indica-ho! (si/no)");
					String amic = scanner.nextLine();
			
					if (amic.equalsIgnoreCase("si")) { //SI AMIC
						System.out.println("Has obtingut un 10% de descompte!");
						double preuBase = preuQuota + allDay;
						double descompte = preuBase * 0.10;
						double preuTotal = preuBase - descompte;
						double preu1rMes = preuTotal + inscripcioFee;
						System.out.printf("%nEl preu total del primer mes és de: %.2f.", preu1rMes);
						System.out.printf("%nEl preu mensual amb el descompte és de: %.2f.", preuTotal);
					} else if (amic.equalsIgnoreCase("no")) { //NO AMIC
						double preuBase = preuQuota + allDay;
						double preu1rMes = preuBase + inscripcioFee;
						System.out.printf("%nEl preu total del primer mes és de: %.2f.", preu1rMes);
						System.out.printf("%nEl preu mensual és de: %.2f.", preuBase);
					} else { //OTRO VALOR
						System.out.println("Invalid option.");
					}
				} else { //OTRO VALOR
						System.out.println("Invalid option.");
				}
			} else { //OTRO VALOR
						System.out.println("Invalid option.");
			}
		} else { //OTRO VALOR
						System.out.println("Invalid option.");
		}
	}
}