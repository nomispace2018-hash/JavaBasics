import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Variables
        int num = 0;
        double suma = 0;
        double input = 0;
		double media = 0;
        
        System.out.println("How many numbers do you want to enter?");
        num = scanner.nextInt();
        
        //Per saber si el numero e spositiu
        while (num <= 0) {
            System.out.println("Invalid amount. Please enter a positive number.");
            num = scanner.nextInt();
        }
        
        //Aquí pedim cada nombre
        for (int i = 1; i <= num; i++) {
            System.out.println("Enter number " + i + ":");
            input = scanner.nextDouble();
            suma = suma + input;
        }
        
        //Calculem la mitja
        media = suma / num;
        
        System.out.printf("The average is: %.2f\n", media);
    }
}