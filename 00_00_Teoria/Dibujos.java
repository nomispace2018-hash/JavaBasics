import java.util.Scanner;

public class Dibujos {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Ex 1. La idea es que si en esta entrada ponemos un numero 5, por ejemplo, nos pinte 5 astericos (*****), o los que pongamos.
		/*Variables
		int num = 0;
		String imprimir = "";
		
		System.out.println("Introdueix un numero: ");
		num = scanner.nextInt();
		
		for (int i = 1; i < num; i++) {
			imprimir = imprimir + "*";
		}
		
		System.out.println(imprimir); */
		
		
		//Ex 2: Numeros que van decreciendo como un arbol
		/*
		1
		12
		123
		1234
		12345
		---
		
		//Variables
		int num = 0;
		String imprimir = "";
		
		System.out.println("Introdueix un numero: ");
		num = scanner.nextInt();
		
		for (int fila = 1; fila <= num; fila++) { //Esta linea se encarga de cada linea que se imprimira
			System.out.print("fila: " + fila + " --> ");
			for (int col = 1; col <= fila; col++) { //Esta linea se encarga de lo que se imprimira en cada columna (los numeros)
				System.out.print(col);
			}
			System.out.println(); //salto de línea
		} */
		
		
		
		//Ex 3: Numeros que van creciendo, arbol invertido
		/*
		12345
		1234
		123
		12
		1
		
		
		//Variables
		int num = 0;
		String imprimir = "";
		
		System.out.println("Introdueix un numero: ");
		num = scanner.nextInt();
		
		for (int fila = 0; fila < num; fila++) { //
			System.out.print("fila: " + fila + " --> ");
			for (int col = 1; col <= num - fila; col++) { //Para cada fila imprimiremos la misma cantidad de columnas que el numero introducido (y por cada fila 1 columna menos, por eso el "num - fila")
				System.out.print(col);
			}
			System.out.println(); //salto de línea
		}*/
		
		//Ex 4
		/*
		
		****1
		***12
		**123
		*1234
		12345
		
		*/
		
		//Variables
		int num = 0;
		
		System.out.println("Introdueix un numero: ");
		num = scanner.nextInt();
		
		//1ro triangulo con asteriscos
		for (int fila = 1; fila <= num; fila++) { //Se imprimiran todas las filas hasta llegar al numero indicado (si indicamos 5 se imprimiran 5)
			System.out.print("fila: " + fila + " --> ");
			for (int col = 1; col <= num - fila; col++) { //Para cada fila imprimimos una columna, para cada columna imprimiremos la misma cantidad de asteriscos que el numero introducido - 1 (como bien pide el ejercicio, son 4 asteriscos, no 5, por eso al numero que introduzcamos, como 5, le restamos siempre las filas, porque por cada fila hay menos asteriscos)
				System.out.print("*");
			}
			
			//2ndo triangulo con numeros
			for (int col = 1; col <= fila; col++) { //Por cada fila imprimimos la misma cantidad de numeros que filas (por ejemplo, si vamos por la fila 2, como "col" inicia con el valor 1, imprimiremos en la fila 2 los numeros "12")
				System.out.print(col);
			}
			
			System.out.println(); //Salto de linea
		}
		
	}
}