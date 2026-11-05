import java.util.Scanner;

public class SplitPositiveNegative {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //Variables
        int num = 0;
        String positius = "";
        String negatius = "";
        
        //Demanem numeros
        for (int i = 1; i < 11; i++) {
            System.out.printf("Enter a number [%d]: %n", i);
            num = scanner.nextInt(); //3
        
            if (num < 0) { 
                negatius = negatius + " " + num;
                
            } else {
                positius = positius + " " + num;
            }
        }
        
        System.out.println("Positive or zero:" + positius);
        System.out.println("Negative:" + negatius);
    }
}