import java.util.Scanner;

public class Condicionals{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdeix una edat: ");
		int edat = scanner.nextInt();
		System.out.println("La teva edat és: " + edat);
		
		// Condicional que mostrará un texto si "es menor de edad"
		if (edat < 18) {
			System.out.println("Has d'anar a l'escola.");
		}
		
		// Condicional que mostrara un texto si no se cumple la condicion de ser menor de 18 
		else if ( edat >= 18 ) {
				System.out.println("Ets major d'edat, a treballar.");
				
		}
		
		// Si queremos poner un rango de edades como condicion (entre 18 y 25) usamos:
		System.out.println("Introdeix una NOVA edat: ");
		int edat2 = scanner.nextInt();
		System.out.println("La teva nova edat és: " + edat2);
		
		if (edat2 < 18) {
			System.out.println("Has d'anar a l'escola.");
		}
		
		else if ( edat2 >= 18 && edat2 <= 25 ) {
			System.out.println("Has d'anar al CFGS..");
		}
				
		else {
			System.out.println("Ets major. A treballar, anda!");
			
		// Si queremos comparar STRINGS usamos lo siguiente:
		String nom = Mia;
		if (nom.equals ("Mia")) {
			System.out.println("Et dius " + nom);
		}
		
		
	}
}	