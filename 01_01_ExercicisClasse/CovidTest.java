import java.util.Scanner;

public class CovidTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Tens febre? (sí/no):");
		String febre = scanner.nextLine();
		
		//FEBRE
		if (febre.equalsIgnoreCase("si") || febre.equalsIgnoreCase("sí")) { //SI
			System.out.println("També tens tos? (sí/no):");
			String tos = scanner.nextLine();
			
			//TOS
			if (tos.equalsIgnoreCase("si") || tos.equalsIgnoreCase("sí")) { //SI
				System.out.println("Et sents cansat o dèbil? (sí/no):");
				String cansatDebil = scanner.nextLine();
				
				//CANSAT O DÉBIL
				if (cansatDebil.equalsIgnoreCase("si") || cansatDebil.equalsIgnoreCase("sí")) { //SI
					System.out.println("Resultat: Possible COVID. Es recomana fer una prova diagnòstica i evitar el contacte amb altres persones.");
				} else {
					System.out.println("Tens dificultat per respirar? (sí/no):");
					String respirar = scanner.nextLine();
					
					//DIFICULTAT RESPIRAR
					if (respirar.equalsIgnoreCase("si") || respirar.equalsIgnoreCase("sí")) { //SI
						System.out.println("Resultat: Possible COVID. Es recomana fer una prova diagnòstica i evitar el contacte amb altres persones.");
					} else { //NO
						System.out.println("Resultat: Poc probable COVID. Si els símptomes empitjoren o apareixen de nous, consulta un professional sanitari.");
					}
				}
			} else { //NO
				System.out.println("Tens mal de coll o mal de cap? (sí/no):");
				String collCap = scanner.nextLine();
				
				// MAL DE COLL
				if (collCap.equalsIgnoreCase("si") || collCap.equalsIgnoreCase("sí")) {
					System.out.println("Resultat: Possible COVID. Es recomana fer una prova diagnòstica i evitar el contacte amb altres persones.");
				} else {
					System.out.println("Resultat: Poc probable COVID. Si els símptomes empitjoren o apareixen de nous, consulta un professional sanitari.");
				}
			}
		} else { //NO
			System.out.println("Has perdut l'olfacte o el gust? (sí/no):");
			String olfacteGust = scanner.nextLine();
			
			//OLFACTE O GUST
			if (olfacteGust.equalsIgnoreCase("si") || olfacteGust.equalsIgnoreCase("sí")) {
				System.out.println("Resultat: Possible COVID. Es recomana fer una prova diagnòstica i evitar el contacte amb altres persones.");
			} else {
				System.out.println("Tens congestió nasal o mocs? (sí/no):");
				String congestioNasal = scanner.nextLine();
				
				//CONGESTIÓ NASAL O MOCS
				if (congestioNasal.equalsIgnoreCase("si") || congestioNasal.equalsIgnoreCase("sí")) {
					System.out.println("Resultat: Poc probable COVID. Si els símptomes empitjoren o apareixen de nous, consulta un professional sanitari.");
				} else {
					System.out.println("Resultat: Poc probable COVID. Si els símptomes empitjoren o apareixen de nous, consulta un professional sanitari.");
				}
			}
		}
	}
}