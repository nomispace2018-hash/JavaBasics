public class SortidaFormatada {
	public static void main(String[] args) {
		
		//SALIDA FORMATADA
		// Para indicar un salto de linea usamos el %n
		System.out.printf("HOLA%n");
		System.out.printf("hola%n");
		
		// Para introducir un texto usamos %s (en minúscula) y %S (en mayúsculas)
		String s1 = "hola";
		System.out.printf("%s %n", s1);
		System.out.printf("%S %n", s1);
		
		// Para introducir numeros usamos los siguientes:
		int x = 10;
		int y = 15;
		String s = "Full";
		double d = 25.56;
		System.out.printf("x = %d i y = %d %n", x, y); // "%d" muestra un valor númerico entero. Por pantalla únicamente se imprimirá lo que hay en las "", lo que hay fuera es el valor de %d. Si usamos más de una %d entonces se mostraran los valores por orden (primero X, luego Y...).
		System.out.printf("%S %d i %d son igual a 10 i 15 %n", s, x, y);
		
		System.out.printf("x = %d - y = %d - s = %s - d = %.2f", x, y, s, d); // El número que va entre "%f" (el .2) indica cuantos decimales queremos mostrar. Si ponemos "%f" solo, entonces se mostraran todos los decimales (max. 6 decimales).
		
		double number = 12345.67890123;
		System.out.println("Println Sense format: " + number); // println muestra todos los decimales
        System.out.printf("Sense format: %f.%n", number); // printf muestra 6 decimales    
        System.out.printf("Amb signe (+): %+f.%n", number); // muestra el signo "+" si el numero es positivo
        System.out.printf("Amb separadors: %,f.%n", number); // muestra una coma para separar los mileros
        System.out.printf("Amplada de 20: %20f.%n", number); // muestra el numero separado en 20 espacios en total y solo muestra 6 decimales
        System.out.printf("Amplada 20 i 3 dec.: %20.3f.%n", number); // muestra el numero separado en 20 espacios y solo muestra 3 decimales.
        System.out.printf("Amplada 20 i 7 dec.: %20.7f.%n", number); // muestra el numero separado en 20 espacios y solo muestra 7 decimales.
        System.out.printf("Amplada 20 i 7 dec. justificat a l'esquerra: %-20.7f.%n", number); // justificado/movido a la izquierda.
		
	}
}