import java.util.Scanner;

public class BucleWhile {
	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
		
		//Ejercicio 1. Introducir numeros positivos y cuando se introduzca uno negativo, se hace una suma de los numeros introducidos y se muestra por pantalla.
		
		System.out.println("Entra un num: ");
		int num = scanner.nextInt();
		int suma = 0;
		
		while (num >= 0) {
			//Sumar
			suma = suma + num;
			//Introducir nuevo numero
			System.out.println("Entra un num: ");
			num = scanner.nextInt();
		}
		//CUIDADO!!! Si creamos una variable dentro de un 'while' esta variable solo existirá dentro del bucle, fuera no.
		System.out.println(suma);
		
		System.out.println("---");
		
		//Ejercicio 2. Introducir el numero 1, contar hasta 10 y cuando llegamos al 10 los mostrarmos por pantalla uno abajo del otro.
		System.out.println("Introdueix un numero: ");
		int num2 = scanner.nextInt();
		
		while (num2 <= 10) {
			System.out.println(num2);
			num2 = num2 + 1; //También funcionaria poner "num2++".
		}
		
		//Para hacerlo viceversa (de un numero grande a uno pequeño) hacemos lo siguiente:
		int num3 = 10;
		
		while (num3 > 1) {
			System.out.println(num3);
			num3 = num3 - 1;
		}
		
		//Si queremos que un progama nos diga si un numero es par o no
		int num4 = 0;
		while (num <= 10) {
			System.out.println(num4);
			
			if (num4 % 2 == 0) { //Hacemos una condición que nos diga que si el numero es par, imprima que es par.
				System.out.println(contador + "és parell.");
			}
			
			contador = contador + 1; //Si el numero no es par, le sumara un "1" para hacerlo par!
	}
}