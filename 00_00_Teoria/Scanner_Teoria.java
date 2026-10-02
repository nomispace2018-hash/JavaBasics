import java.util.Scanner; //Importem la biblioteca de funcions Scanner que ens permet intoduir dades per la terminal
public class Scanner_Teoria {
    public static void main(String[] args) {
        
        Scanner scanner; //Declarem una variable de tipus Scanner
        scanner = new Scanner(System.in); //Creem un objecte Scanner que llegueixi dades de System.in (les que introduïm al sistema/terminal)
        
		//Les següents dades ens les demanarà en diferents salts de línea
        System.out.println("Entra una linia: ");
        String linia = scanner.nextLine();
        System.out.println(linia);
        
        System.out.println("Entra un número: ");
        int num = scanner.nextInt();
        System.out.println(num);
        
		System.out.println("Entra el preu: ");
        double preu = scanner.nextDouble();
        System.out.println(preu);
        
		//En caso de que nos omita las siguientes entradas (que nos pregunte pero no nos deje contestar) ponemos "scanner.next" Si no, ponemos debajo de la primer avariable con valor "scanner" un "scanner.nextLine();" a secas.
		
		//Si volguessim demanar entrades en la mateixa línea:
        System.out.println("Entra una línea, un número i un preu separats per espais: ");
        
		String linia2 = scanner.next();        
        int num2 = scanner.nextInt();        
        double preu2 = scanner.nextDouble();
        
		System.out.printf("%n La línea és %s, el número és %d i el preu és %.0f", linia2, num2, preu2);
        
    }
}