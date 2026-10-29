import java.util.Scanner;

public class TemperatureSensor {
    public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter temperature from sensor 1:");
        int t1 = scanner.nextInt();
        
        System.out.println("Enter temperature from sensor 2:");
        int t2 = scanner.nextInt();
        
        System.out.println("Enter temperature from sensor 3:");
        int t3 = scanner.nextInt();
        
        //Si els tres superen els 30ºC mostrem ERROR
        if (t1 > 30 && t2 > 30 && t3 > 30) {
            System.out.println("Temperature: ERROR");
        }
        //Comprovem si el sensor 1 es el valid mes alt
        else if ((t1 <= 30) && (t1 >= t2 || t2 > 30) && (t1 >= t3 || t3 > 30)) {
            System.out.println("Temperature: " + t1);
        } 
        //Comprovem si el sensor 2 es el valid mes alt
        else if ((t2 <= 30) && (t2 >= t1 || t1 > 30) && (t2 >= t3 || t3 > 30)) {
            System.out.println("Temperature: " + t2);
        } 
        else {
            System.out.println("Temperature: " + t3);
        }
    }
}