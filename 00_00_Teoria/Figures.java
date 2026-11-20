import java.util.Scanner;

public class Figures {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*Figura a representar
		Linea 1|   123321		| 3 espais a la esquerra
		Linea 2|  12344321		| 2 espais a la esquerra
		Linea 3| 1234554321		| 1 espai a la esquerra
		Linea 4|123456654321	| 0 espais a la esquerra
		*/
		
		//Variables
		int N = 4; //indica cuantas lineas queremos
		
		//Dibuixar linia
		for (int linia = 1; linia <= N - linia; linia++) {
			
			//dibuixar espais
			for (int i = 1; i <= N - linia; i++) { //el numero 4 se le resten las lineas (como por ejemplo, la linea 4 - 4 = 0, entonces imprimimos 0 espacios/asteriscos)
				System.out.print("*");
			}
			
			//dibuixar creixent (123)
			for (int i = 1; i <= linia + 2; i++) { //aqui imprimiremos numeros mientras sean menores que la linea en la que estamos +2 (por ejemplo, si estamos en la linea 1, si le sumamos 2 da 3 (1+2=3), por lo que se ejecutara este bucle 3 veces (es decir, se imprimira 1, 2, 3). Si la linea es 2 (2+2=4), se ejecutara el bucle 4 veces (se imprimiran 4 veces)
				System.out.print(i);
			}
			
			//dibuixar decreixent (321)
			for (int i = linia + 2; i >= 1; i--) {
				System.out.print(i);
			}
		
		System.out.println(); //imprimimos un salto de linea por cada linea que hacemos
		
	}
}