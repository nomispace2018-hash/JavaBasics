import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count0 = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0;
        int count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0;
        
        System.out.println("Enter a number between 0 and 9. Enter -1 to finish: ");
        int num = scanner.nextInt();
        
        //El bucle s'executa mentre el numero no sigui -1
        while (num != -1) {
            //Comprovem si el nombre està dins del rang (0-9)
            if (num >= 0 && num <= 9) {
                switch (num) {
					case 0 -> count0++;
                    case 1 -> count1++;
                    case 2 -> count2++;
                    case 3 -> count3++;
                    case 4 -> count4++;
                    case 5 -> count5++;
                    case 6 -> count6++;
                    case 7 -> count7++;
                    case 8 -> count8++;
                    case 9 -> count9++;
                }
            } else {
                //Si no esta entre 0 i 9, i tampoc és -1 mostrem el missatge d'error
                System.out.println("Invalid number. Enter between 0 and 9. Enter -1 to finish.");
            }
            
            //Llegim el següent número
            num = scanner.nextInt();
        }
        
        System.out.println("Total 0: " + count0);
        System.out.println("Total 1: " + count1);
        System.out.println("Total 2: " + count2);
        System.out.println("Total 3: " + count3);
        System.out.println("Total 4: " + count4);
        System.out.println("Total 5: " + count5);
        System.out.println("Total 6: " + count6);
        System.out.println("Total 7: " + count7);
        System.out.println("Total 8: " + count8);
        System.out.println("Total 9: " + count9);
        
    }
}