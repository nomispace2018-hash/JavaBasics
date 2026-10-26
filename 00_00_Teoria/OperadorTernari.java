import java.util.Scanner;

public class OperadorTernari {
	public static void main(String[] args) {
		//Exercici 1. Fes un programa amb condicionals que donat una edat entregada per teclat et retorni el següent tex: si l'edat és més petit o igual a 1: "Té 1 any", si l'edat és més gran que 1 mostrarà el missatge "Te ___ anys".
		
		Scanner scanner = new Scanner(System.in);
		int edat = 0;
		
		System.out.println("Quina edat tens?");
		edat = scanner.nextInt();
		scanner.nextLine();
		
		if (edat <= 1) {
			System.out.println("Té 1 any.");
		} else {
			if (edat >= 65) {
				System.out.println("Té " + edat + " anys i està jubilat.");
			} else  {
				System.out.println("Té " + edat + " anys.");
			}
		}
		
		//Condició ? __ si compleix la condició : ____ si no compleix la condició
		String text = (edat <= 1) ? ("Té " + edat + " any") : ("Té " + edat + " anys");
		System.out.println(text);
		System.out.println((edat <=1) ? ("Té " + edat + " any") : ("Te " + edat + " anys."));

		//Exemple amb 3 casos
		String text2 = (edat >= 65) ? ("Té " + edat + " anys i està jubilat.") : ("Té " + edat + " anys"); 
		
		text = (edat <=1) ? ("Té " + edat + " any") : text2; //Si queremos que una condición nos lleve a otra (que text nos lleve a text2) entonces debemos de definir text2 antes.
		System.out.println(text);
		
		
		//Exercici 2. Mostra si un número entrar per teclar és parell o senar, si es parell mostrarà el missatge "El número és parell" i si no, mostrará "El número és senar".
		int num = scanner.nextInt();
		String text3 = (num % 2 == 0) ? ("El número " + num + " és parell") : ("El número " + num + " és senar");
		System.out.print(text3);
		
	}
}