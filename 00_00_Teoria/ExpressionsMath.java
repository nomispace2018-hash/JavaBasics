public class ExpressionsMath {
	public static void main(String[] args) {
		//Hi ha diversos operadors: +, -, /, *, % (residu de divisió)
		
		//EXEMPLE D'EXPRESSIÓ BÀSICA
		int expressio = 2* 12 + 3;
		
		System.out.println(expressio);
		int x = 10;
		int y = 3;
		int z = 4;
		
		int resultat = ((x * y) + (7 * z)) / (x - z);
		System.out.println(resultat);
		
		
		//ALTRES EXEMPLES
		//Las operaciones siempre se hacen de izquierda a derecha, si hay / o * se hacen primero que las + o -. Si hay / o * a la vez, se hace de izquierda a derecha.
		System.out.println(4 + 3 / 2); // Primero las * o /, resultado 5 (3/2 da 1 y como residu 1, el 1 se suma con el 4 y da 5).
		System.out.println(4 % 5 * 50); // Como el % y el * son igual de importantes la operacion se hace de izquiera a derecha, resultado 200 (4 entre 5 da de residu 4, el 4 por 50 da 200).
		System.out.println(4 / 5 * 50); // Comenzamos de izquiera a derecha, resultado 0 (4 entre 5 da 0 y queda el 4 como residu, el 0 se multiplica por 5 y da 0).
		
		
		// COMPATIBILITAT ENTRE NÚMEROS
		// Como en el ejemplo siguiente, Java permite la compatibilidad entre numeros entres (el 3 y 4) y numeros reales (el 1.0).
		System.out.println(3 + 4 * 1.0);
		System.out.println(1.5 * 3 / 2); 
		
		
		//PROVES AMB REALS
		double d = 12.5;
		float f = 12.5f; // Podemos poner una f después del numero o un "(double)" delante para indicar que aunque es un valor doble, que lo almacene en un float.
		System.out.println(d + f);
		
		// ---
		
		int nota1 = 10;
		int nota2 = 7;
		int nota3 = 9;
		
		double mitjana = (double)(nota1 + nota2 + nota3) / 3; // Ponemos el "(double)" delante porque las 3 notas osn ENTERAS y el DOUBLE almacena numeros decimales.
		System.out.println("Mitjana: " + mitjana);
		
		double mitjanaArrodonida = Math.round(mitjana); // Redondeamos.
		System.out.println("Mitjana arrodonida: " + mitjanaArrodonida);
	
	}	
}	