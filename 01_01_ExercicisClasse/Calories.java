import java.util.Scanner;

public class Calories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Demanem dades
        System.out.println("Enter calories to burn:");
        int calories = scanner.nextInt();
        
        System.out.println("Enter MET value:");
        float met = scanner.nextFloat();
        
        System.out.println("Enter your weight in kg:");
        float weight = scanner.nextFloat();
        
        //Calculem els minuts totals segons la fórmula MET
        double totalMin = (calories * 200.0) / (met * 3.5 * weight);
        
        //Passem el resultat a segons totals
        int totalSec = (int) (totalMin * 60);
        
        //Calculem minuts i segons restants
        int minutes = totalSec / 60;
        int seconds = totalSec % 60;
        
        //Mostrem el resultat formatat a MM:SS
        System.out.printf("Running time: %02d:%02d%n", minutes, seconds);
    }
}