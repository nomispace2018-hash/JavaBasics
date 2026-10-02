import java.util.Scanner;

public class EntradaReadLine {
	public static void main(String [] args) {
		
		//EXERCICI ENTRADA DADES PER TECLAT
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introdueix un preu: ");
		double preu = entrada.nextDouble();
		System.out.printf("El preu és %.2f%n", preu);
		
		System.out.println("Introdueix unitats: ");
		int unitats = entrada.nextInt();
		System.out.printf("Unitats: %d%n", unitats);
		
		System.out.printf("El preu total és: %.2f%n", unitats*preu);
		
		System.out.println("Introdueix el nom de la roba: ");
		String roba = entrada.next(); /* Et retorna el text fins el primer espai
		
		String roba = entrada.nextLine(); El retorna el text fins l'intro */
		System.out.printf("La peça de roba és: %s%n", roba); 
		
	}
}