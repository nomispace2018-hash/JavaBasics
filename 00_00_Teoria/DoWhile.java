import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		/* //EXEMPLE #1 DE "DO WHILE"
		Lo que hace es indicar que se tiene que hacer mientras se cumpla una condición. Podria ser que un "while" nunca se ejecute (mira de cambiar el siguiente codigo como si fuer un WHILE), pero un "do while" se ejeucta siempre minimo 1 vez.
		int x = 0;
		do {
			x ++
			System.out.println(x);
		} while (x < 10);
		*/		
		
		//EXEMPLE #2
		String nSecretText = args[0]; //Demanem valors d'entrada al executar el codi, el 0 indica la posició dels argumnts que entrem
		int nSecret = Integer.parseInt(nSecretText);
		int nIntents = 0;
		
		do {
			//Llegir següent
			System.out.println("Num? ");
			int num = scanner.nextInt();
			nIntents++;
			
			//Tractament
			if (num != secret) {
				if (num < 0) {
					System.out.println("At least 0!");
				} else if (num > 100) {
					System.out.println("Massa gran");
				} else if (num > nSecret) {
					System.out.println("Més petit");
				} else {
					System.out.println("Més gran");
				
				}
			}
		
		} while (num != nSecret);
		
		
	}
}