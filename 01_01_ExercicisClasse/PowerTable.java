import java.util.Scanner;

public class PowerTable {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables
		int base = 0;
		int exponent = 0;
		long calcul = 0;
		String resultat = "";
		
		//Pedimos el numero base
		System.out.println("Enter the base (2-100):");
		base = scanner.nextInt();
		
		//Si la base esta fuera de los rangos
		while (base < 2 || base > 100) {
			System.out.println("Enter the base (2-100):");
			base = scanner.nextInt();
		}
		
		//Pedimos el exponente
		System.out.println("Enter maximum exponent (2-9):");
		exponent = scanner.nextInt();
		
		//Si el exponente esta fuera de los rangos
		while (exponent < 2 || exponent > 9) {
			System.out.println("Enter maximum exponent (2-9):");
			exponent = scanner.nextInt();
		}
		
		for (int i = 1; i <= exponent; i++) {
			calcul = (long)Math.pow(base, i);
			
			//Si es el primer numero (1) entonces imprimimos sin espacio adelante
			if (i == 1) {
				resultat = base + "^" + i + "=" + calcul;
			//Si es el segundo o resto de numeros (NO 1) imprimimos el resultado de antes y una coma luego + un espacio (pero sin coma al final).
			} else {
				resultat = resultat + ", " + base + "^" + i + "=" + calcul;
			}
		}
		System.out.println(resultat);
	}
}

/* Otra forma de hacerlo
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //Variables
        int base = 0;
        int maximo = 0;
        long calcul = 0;
        
        //Pedimos base
        System.out.println("Enter the base (2-100):");
        base = scanner.nextInt();
        
        //Si el valor no es valido
        while (base < 2 || base > 100) {
           System.out.println("Enter the base (2-100):");
            base = scanner.nextInt(); //Volvemos a pedir el valor
        }
        
        //Pedimos el exponente
        System.out.println("Enter maximum exponent (2-9):");
        maximo = scanner.nextInt();
        
        //Si el valor no es valido
        while (maximo < 2 || maximo > 9) {
            System.out.println("Enter maximum exponent (2-9):");
            maximo = scanner.nextInt(); //Lo volvemos a pedir
        }
        
        for (int i = 1; i <= maximo; i++) {
            calcul = (long)Math.pow(base, i);
            
            if (i != maximo) {
                System.out.printf("%d^%d=%d, ", base, i, calcul);
            } else {
                System.out.printf("%d^%d=%d", base, i, calcul);
            }
        }
    }
} */
