import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //Variables
        int num = 0;
        int calcul = 0;
        
        //Demanem numero a multiplicar
        System.out.println("Enter a number: ");
        num = scanner.nextInt();
        
        //Calculem a la tabla
        for (int i = 0; i <= 10; i++) {
            calcul = num * i;
            System.out.println(num + " x " + i + " = " + calcul);
        }
    }
}