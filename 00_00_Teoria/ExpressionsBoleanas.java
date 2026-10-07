import java.util.Scanner;

public class ExpressionsBoleanas {
	public static void main(String[] args) {
		
		// Operadores relacionales (> major, < menor, >= major o igual, <=menor o igual, == igual, != no igual)
		System.out.println(4 + 2 > 5); // Devolveria "true"
		System.out.println(5 > 7); //Devolveria "false"
		
		
		// Podemos asignarle a una variable boleana una operación y que ella clacule si es "true" o "false
		int a = 5;
		int b = 7;
		boolean esMajor = a > b; //Devolveria "false", porque el valor de A no es mayor que el valor e B
		
		
		// También podemos asignarle a una variable boleana un valor "true" o "false" directamente
		boolean plou = false;
		boolean faSol = true;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Fa sol? ");	
		faSol = scanner.nextBoolean();
		System.out.println("Fa sol? " + faSol);
		
		
		// Operadores booleanos
			// and -> &&
			// or -> ||
			// or exclusive ->   ^    (devuelve true solo si uno de los dos operadores es verdadero, pero no ambos. Si los dos son true o los dos son false, el resultado es false)
		
		System.out.println("Plou i fa sol? " + (plou && faSol)); //Plou i fa sol? NO (false)
		System.out.println("Plou o fa sol? " + (plou || faSol)); //Plou o fa sol? SI, fa sol (true)
		
		boolean dia = true;
		boolean nit = true;
		System.out.println("Es de dia o es de nit? "  + (dia ^ nit)); // Devolverá false. No puede ser de dia y de noche a la vez.
		
		
			// not ->    ! 	   (le cambia el valor a una variable boleana, si una variable era inicialmente "true" ahora es "false" y viceversa)
				//Ejemplo 1
		System.out.printlnt(!(3 > 4)); // 3 no es mayor de 4, asi que como el programa se niega a aceptar que 3 es mayor que 4, con el "!" obligamos a que esta operación sea true.
		
				//Ejemplo 2
		boolean y = true;
		boolean x = false;
		System.out.println(!y); //Resultat false
		System.out.println(!x); //Resultat true
		
	}
}