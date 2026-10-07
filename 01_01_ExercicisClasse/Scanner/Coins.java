import java.util.Scanner; 

public class Coins {
    public static void main(String[] args) {
        
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter the amount of money: ");
        double canvi = scanner.nextDouble();
        int euros = (int)Math.floor(canvi/1);
        int cents50 = (int)Math.floor((canvi%1)/0.5);
        int cents20 = (int)Math.floor(((canvi%1)%0.5)/0.2);
        int cents10 = (int)Math.floor((((canvi%1)%0.5)%0.2)/0.1);
        int cents5 = (int)Math.floor(((((canvi%1)%0.5)%0.2)%0.1)/0.05);
        int cents1 = (int)Math.floor((((((canvi%1)%0.5)%0.2)%0.1)%0.05)/0.01);
        System.out.println("1 euro coins: " + euros);
        System.out.println("50 cent coins: " + cents50);
        System.out.println("20 cent coins: " + cents20);
        System.out.println("10 cent coins: " + cents10);
        System.out.println("5 cent coins: " + cents5);
        System.out.println("1 cent coins: " + cents1 );
        
        
    }
}