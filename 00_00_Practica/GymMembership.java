import java.util.Scanner;

public class GymMembership {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double quota = 0;
		double allDay = 0;
		double piscinaSauna = 0;
		double locker = 0;
		
		String error = "Invalid option";
		
		System.out.println("Benvingut al Gimnas. Quina quota vols? (1/2)");
		System.out.println("OneGym: acces unic gimnas, 24.90€/mes.");
		System.out.println("MultiGym:  acces tots gimnasos de la cadena, 34.90€/mes.");
		int seleccio1 = scanner.nextInt();
		
		//SELECCIÓ DE QUOTA
		if (seleccio1 == 1) {
			System.out.println("Seleccionat.");
			quota = 24.90;
		} else if (seleccio1 == 2){
			System.out.println("Seleccionat.");
			quota = 34.90;
			
			System.out.println("Quin horari vols? (1/2)");
			System.out.println("Matí (6-12am): gratis.");
			System.out.println("Tot el dia: +7.50€/mes.");
			int horari = scanner.nextInt();
			
			//HORARI MATI
			if (horari == 1) {
				System.out.println("Seleccionat.");
			} else if (horari == 2) { //HORARI TOT EL DIA
				System.out.println("Seleccionat.");
				allDay = 7.50;
			} else {
				System.out.println(error);
			}
			
			scanner.nextLine();
			System.out.println("Vols piscineta i sauna per 9.90€/mes? (si/no)");
			String seleccio2 = scanner.nextLine();
				
			// PISCINETA I SAUNA
			if (seleccio2.equalsIgnoreCase("si")) { //SI
				System.out.println("Seleccionat.");
				piscinaSauna = 9.90;
					
				System.out.println("Vols un armariet també per 9.90€/mes? (si/no)");
				String seleccio3 = scanner.nextLine();
					
				// ARMARI LOCKER
				if (seleccio3.equalsIgnoreCase("si")) { //SI
					System.out.println("Seleccionat.");
					locker = 9.90;
				} else if (seleccio3.equalsIgnoreCase("no")) { //NO
						System.out.println("Ok.");
				} else {
					System.out.println(error);
				}
					
			} else if (seleccio2.equalsIgnoreCase("no")) { //NO
				System.out.println("Ok.");
			} else {
				System.out.println(error);
			}
			
		} else {
			System.out.println(error);
		}
		
		//CALCUL FINAL
		double preuBase = quota + allDay + piscinaSauna + locker;
		double descompte = preuBase * 0.10;
		double preuAmbDescompte = 0;
		double preu1rMes = 0;
		double preuMensual = 0;
		double inscripcioFee = 12.5;
		
		scanner.nextLine();
		System.out.println("Tens un amic/a? (si/no)");
		String seleccio4 = scanner.nextLine();
		
		if (seleccio4.equalsIgnoreCase("si")) {
			System.out.println("S'ha aplicat un descompte del 10% per a tu.");
			preuAmbDescompte = preuBase - descompte;
			preu1rMes = preuAmbDescompte + inscripcioFee;
			preuMensual = preuAmbDescompte;
			
			System.out.printf("El primer mes hauràs de pagar: %.2f", preu1rMes);
			System.out.printf("%nLa resta de mesos hauràs de pagar: %.2f", preuMensual);
		} else if (seleccio4.equalsIgnoreCase("no")) {
			System.out.println("No s'ha aplicat un descompte del 10% per a tu.");
			preu1rMes = preuBase + inscripcioFee;
			preuMensual = preuBase;
			
			System.out.printf("El primer mes hauràs de pagar: %.2f", preu1rMes);
			System.out.printf("%nLa resta de mesos hauràs de pagar: %.2f", preuMensual);
		} else {
			System.out.println(error);
		}
	}
}