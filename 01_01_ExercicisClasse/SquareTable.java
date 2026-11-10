import java.util.Scanner;

public class SquareTable {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		int valor = 0;
		int calcul = 0;
		String resultat = "";
		
		//Pedimos un valor entre 2 y 100
		System.out.println("Enter maximum value (2-100):");
		valor = scanner.nextInt();
		
		//Si el valor q introducen NO esta en el rango de numeros, volvemos a pedir
		while (valor < 2 || valor > 100) {
			System.out.println("Enter maximum value (2-100):");
			valor = scanner.nextInt();
		}
		
		for (int i = 1; i <= valor; i++) {
			calcul = i * i;
			
			//Si es el primer numero (1) entonces imprimimos sin espacio adelante
			if (i == 1) {
				resultat = i + "^2=" + calcul;
			//Si es el segundo o resto de numeros (NO 1) imprimimos el resultado de antes y una coma luego + un espacio (pero sin coma al final).
			} else {
				resultat = resultat + ", " + i + "^2=" + calcul;
			}
		}
		
		System.out.println(resultat);
	}
}