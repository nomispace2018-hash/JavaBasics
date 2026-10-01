import java.util.Scanner; //Importem la biblioteca de funcions Scanner que ens permet intoduir dades per la terminal
public class Scanner_Teoria
{
    public static void main(String[] args) {
        
        Scanner scanner; //Declarem una variable de tipus Scanner
        scanner = new Scanner(System.in); //Creem un objecte Scanner que llegueixi dades de System.in (les que introduïm al sistema/terminal)
        
        System.out.println("Entra una linia: ");
        String linia = scanner.nextLine();
        System.out.println(linia);
        
        System.out.println("Entra un número: ");
        int num = scanner.nextInt();
        System.out.println(num);
        
		System.out.println("Entra el preu: ");
        double preu = scanner.nextDouble();
        System.out.println(preu);
        
        
    }
}