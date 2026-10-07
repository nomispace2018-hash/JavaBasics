import java.util.Scanner;

public class Coins2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of money: ");
        double amount = scanner.nextDouble();

        // Convertimos a céntimos totales redondeando a entero
        int cents = (int) Math.round(amount * 100);

        int m1euro = cents / 100;
        cents %= 100;

        int m50cent = cents / 50;
        cents %= 50;

        int m20cent = cents / 20;
        cents %= 20;

        int m10cent = cents / 10;
        cents %= 10;

        int m5cent = cents / 5;
        cents %= 5;

        int m1cent = cents;

        System.out.printf("1 euro coins: %d%n", m1euro);
        System.out.printf("50 cent coins: %d%n", m50cent);
        System.out.printf("20 cent coins: %d%n", m20cent);
        System.out.printf("10 cent coins: %d%n", m10cent);
        System.out.printf("5 cent coins: %d%n", m5cent);
        System.out.printf("1 cent coins: %d%n", m1cent);
    }
}