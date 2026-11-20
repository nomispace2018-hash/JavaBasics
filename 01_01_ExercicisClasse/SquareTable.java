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

/* Otra forma de hacerlo (ACTUALIZADO)
	import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //Variables
        int maxim = 0;
        int quadrat = 0;
        
        //Pedimos numero
        System.out.println("Enter maximum value (2-100):");
        maxim = scanner.nextInt();
        
        //Si el valor no es valido
        while (maxim < 2 || maxim > 100) {
            System.out.println("Enter maximum value (2-100):");
            maxim = scanner.nextInt(); //volvemos a pedirlo
        }
        
        for (int i = 1; i <= maxim; i++) {
            quadrat = i * i;
            if (i != maxim) {
                System.out.printf("%d^2=%d, ", i, quadrat);
            } else {
                System.out.printf("%d^2=%d", i, quadrat);
            }
            
        }
    }
} */
