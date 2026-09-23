/*
 * Anem a fer un programa per entendre variables i tipus de dades
*/
public class TipusDeDades {
	public static void main(String[] args) {		
		// LITERALS
		System.out.println(10); //numero enter
		System.out.println(10.5); //numero real 
		System.out.println( 2 * 3 + 4); //expressió
		System.out.println('H'); //un únic caràcter
		System.out.println("Variables"); //Mostra per pantalla el text "Variables"
		
		
		// VARIABLES
		//son elements que emmagatzenem valors
		
			//Variables identificadores;
		String nom;   //"string" avisa que crearemos y guardaremos una variable textual
		nom = "Mia";  //li assignem un valor a la variable
		System.out.println(nom); //li diem al programa que ensenyi per pantalla el valor de la variable
		
			//Ordres
		System.out.println("Bon" + "dia!"); //concatena o adjunta paraules
		System.out.println("Hola " + nom + "!"); //imprimeix el text "hola " + el valor de la variable per pantalla
			
		
			//Variables + Literals
				// --- Variables Literales Enteras
		int numero; //"int" avisa que crearemos y guardaremos una variable númerica entera
		numero = 10; //almacena el 10 como valor de la variable "numero" 
		System.out.println(numero); //mostra per pantalla el valor de la variable
		System.out.println("El número final és: " + numero); //imprimeix per pantalla el text entre "" i el valor de la variable
		
		
				// --- Variables Literales Reales
		double real; //"double" avisa que crearemos y guardaremos una variable númerica real
		real = 10.5;
		System.out.println(real); //numero real
		System.out.println( 2 * numero + 4); //creamos una expresión con numeros y el valor de nuestra variable real
		
				// --- Variables Literales de un Único Carácter
		char caracter; //"char" avisa que crearemos y guardaremos una variable con un único caracter
		caracter = 'H'; //almacena la letra H como valor de la varibale caracter
		System.out.println(caracter); //imprime por pantalla el valor de la variable "caracter"
		
	}
}