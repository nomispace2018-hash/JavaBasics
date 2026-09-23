public class Variables1 {
	public static void main(String[] args){
		//0. Com es defineix una variable - CamelCase
		
		//TIPUS DE VARIABLES
		//1. Bàsics - int, double, char, String
			/* Numèrics enters (byte (emmagatzema max 8 bits/dades), short (emmagatzema max 16 bits/dades), int (emmagatzema max 32 bits/dades) , long (emmagtzema max 64 bits/dades)
			   Numèrics reals (float, double) */
		
		int numAlumnes = 33;
		int numAules = 2;
		
		System.out.println("Número Alumnes totals: " + numAlumnes);
		
			//El problema es que si queremos dividir 33/2 nos dara un numero DECIMAl, por lo que tenemos que almacenarlo en un "double"
		
		double alumnesAula = (double)numAlumnes / numAules; 
			/* Ponemos dos "doubles" porque "numAlumnes" y "numAules" son ENTEROS, y el RESULTADO sera decimal y lo tenemos que almacenar en un double. 
			Entonces para que java nos deje almacenar operaciones de numeros enteros en variables reales, convertimos los numeros enteros en decimales usando un (double) delante.*/
		System.out.println("Número alumnes per aula: " + alumnesAula);
		
		int convertirAEnter = (int)alumnesAula;
			/* Esta es una prueba. Intentamos convertir el resultado de "alumnesAula" que es decimal en un ENTERo usando (int) delante. */
		System.out.println("Convetir un tipus de double a enter: " + convertirAEnter);
		
		double sumaAlumnes = alumnesAula + alumnesAula;
			/* Como "alumnesAula" es decimal, la suma de estas dos lo almacenaremos en una variable decimal (aunque el resultado sea entero). */
		System.out.println("Comprovació: " + sumaAlumnes);
	
		
		//2. Mostrar contingut per pantalla
		//3. Operacions +, -, *, /, %
		int esParell = numAlumnes % 2;
		System.out.println("Es parell: " + esParell);
		
		
		
	
	
	
	
	}
}