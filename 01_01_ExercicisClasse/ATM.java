import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter available balance:");
        double balance = scanner.nextDouble();
        
        System.out.println("Enter withdrawal amount:");
        double withdrawal = scanner.nextDouble();
        
        System.out.println("Do you have a credit line? (true/false)");
        boolean hasCredit = scanner.nextBoolean();
        
        //Comprovem si la quantitat es menor o igual a 0
        if (withdrawal <= 0) {
            System.out.println("Withdrawal not possible");
        } 
        //Comproem si l'import és multiple de 20€
        else if (withdrawal % 20 != 0) {
            System.out.println("Withdrawal amount must be a multiple of 20 €");
        } 
        //Comprovem si supera el limit màxim diari (600 €)
        else if (withdrawal > 600) {
            System.out.println("The maximum daily withdrawal is 600 €");
        } 
        //Si el client te prou saldo al compte
        else if (balance >= withdrawal) {
            double newBalance = balance - withdrawal;
            System.out.println("Please take your money");
            System.out.printf("Your new balance is now: %.2f €%n", newBalance);
            System.out.printf("Commission: 0.00 €%n");
        } 
        //Si no té prou saldo comprovem si pot utilitzar el credit
        else {
            double creditNeeded = withdrawal - balance;
            
            //Si té credit i el credit necessari no supera els 300 euros
            if (hasCredit && creditNeeded <= 300) {
                double newBalance = balance - withdrawal;
                System.out.println("Please take your money");
                System.out.printf("Your new balance is now: %.2f €%n", newBalance);
                System.out.printf("Commission: 5.00 €%n");
            } else {
                System.out.println("Withdrawal not possible");
            }
        }
    }
}