import java.util.Scanner;

public class BucleFor {
	public static void main(Sting[] args) {
				
		//Mostrar 10 números del 1 al 10 por pantalla con un WHILE
		int num = 1;´
		while (num >= 1 && num <= 10) {
			System.out.println("NUM: " + num);
			num++;
		}
		
		//Ahora con un FOR -> for (______; ______; ______) {
		//for (inicio__; mienras__; incremento__);
		for (int i = 1; i <= 10; i++) { //Iniciamos el programa con la variable con el valor 1, se ejecutara mientras sea inferior a 10 y por cada vez que se ejecute incrementa +1.
			System.out.println("NUM: " + i);
		}
		
		//También podemos mostrar los numeros del 10 al 1
		for (int x = 10; x >= 1; x--) {
			System.out.println("NUM: " + x);
		}
		
	}
}