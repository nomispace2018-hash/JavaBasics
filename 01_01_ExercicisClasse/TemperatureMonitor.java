import java.util.Scanner;

public class TemperatureMonitor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables
        double temp = 0;
        double average = 0;
        double guardar = 0;
        double mitjana = 0;
        double comptar = 0;

        System.out.println("Enter temperature (999 to finish): ");
        temp = scanner.nextDouble();

        if (temp == 999) {
            System.out.println("No valid temperatures");
        } else {
            while (temp != 999) {
                
                if (temp >= -10.0 && temp <= 49.0) {
                    guardar = guardar + temp;
                    comptar++;
                }
				
				System.out.println("Enter temperature (999 to finish): ");
                temp = scanner.nextDouble();
            }
            mitjana = guardar / comptar;
            System.out.println("Average: " + mitjana);
        }
    }
}