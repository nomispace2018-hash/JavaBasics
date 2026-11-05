import java.util.Scanner;

public class TextSearch {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //Variables
        int textAmount = 0;
        String word = "";
        String text = "";
        int exactMatches = 0;
        int ignoreMatches = 0;
        
        
        //Pedimos cuantos textos
        System.out.println("How many texts?");
        textAmount = scanner.nextInt();
        scanner.nextLine();
        
        while (textAmount <= 0) {
            System.out.println("How many texts?");
            textAmount = scanner.nextInt();
            scanner.nextLine();
        }
        
        //Pedimos que palabra exacta buscar
        System.out.println("Word to search for:");
        word = scanner.nextLine();
        
        for (int i = 1; i <= textAmount; i++) {
            System.out.println("Enter text " + i + ":");
            text = scanner.nextLine();
            
            if (text.equals(word)) {
                exactMatches++;
            }
            
            if (text.equalsIgnoreCase(word)) {
                ignoreMatches++;
                
            }
        }
        
        System.out.println("Exact matches: " + exactMatches);
        System.out.println("Matches ignoring case: " + (ignoreMatches - exactMatches));
        
    }
}