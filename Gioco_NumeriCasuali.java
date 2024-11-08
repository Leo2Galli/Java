import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroCasuale = random.nextInt(1001);
        int tentativo;
        int numeroTentativi = 0;
        
        System.out.println("Indovina il numero segreto");
        System.out.println("Il numero è compreso da 0 a 1000");

        while (true) {
            System.out.print("Inserisci un numero: ");
            tentativo = scanner.nextInt();
            numeroTentativi++;
            
            if (tentativo < numeroCasuale) {
                System.out.println("Troppo piccolo!");
            } else if (tentativo > numeroCasuale) {
                System.out.println("Troppo grande!");
            } else {
                System.out.println("Hai vinto!");
                System.out.println("COMPLIMENTI HAI INDOVINATO! Hai indovinato in " + numeroTentativi + " tentativi.");
                break;
            }
        }
        
        scanner.close();
    }
}