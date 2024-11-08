import java.util.Scanner;

public class Main                                                                                                                                                                                                                 {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static void main(String[] args)                                                                                                                                                                 {
        Scanner scanner = new Scanner(System.in);





        System.out.println(CYAN + "                                                                                                             ");
        System.out.println(CYAN + "                                                                                                             ");
        System.out.println(CYAN + "                                                                                                             ");
        System.out.println(CYAN + "                                                                                                             ");
        System.out.println(CYAN + "                                                                                                             ");
        System.out.println(CYAN + "                                                                                                             ");
        System.out.println(CYAN + "         ,------.                              ,--.                                                          ");
        System.out.println(CYAN + "         |  .---' ,---. ,--.,--. ,--,--.,-----.`--' ,---. ,--,--,   ,---.                                     ");
        System.out.println(CYAN + "         |  `--, | .-. ||  ||  |' ,-.  |`-.  / ,--.| .-. ||      | | .-. :                                    ");
        System.out.println(CYAN + "         |  `---.' '-' |'  ''  '| '-'  | /  `-.|  |' '-' '|  ||  | |   --.                                    ");
        System.out.println(CYAN + "         `------' `-|  | `----'  `--`--'`-----'`--' `---' `--''--' `----'                                    ");
        System.out.println(CYAN + "                    `--'                                                                                     ");
        System.out.println(CYAN + "                                                                                                             ");
        System.out.println(MAGENTA + "                                       Secondo Grado                                                         ");
        System.out.println(CYAN + "                                                                                                             ");
        System.out.println(CYAN + "                                                                                                             ");




        System.out.println(WHITE + " ------------------------------------------------------------------------------------");
        System.out.print(BLUE + "Inserisci il valore di a:    ");
        double a = scanner.nextDouble();
        System.out.print(BLUE + "Inserisci il valore di b:    ");
        double b = scanner.nextDouble();
        System.out.print(BLUE + "Inserisci il valore di c:    ");
        double c = scanner.nextDouble();
        System.out.println(WHITE + " ------------------------------------------------------------------------------------");

        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0)                                                                                                                                                                                         {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println(GREEN + "Le soluzioni dell'equazione sono: x1 = " + x1 + " e x2 = " + x2);
        } else if (discriminante == 0)                                                                                                                                                                         {
            double x = -b / (2 * a);
            System.out.println(YELLOW + "L'equazione ha una soluzione doppia: x = " + x);
        } else                                                                                                                                                                                                                         {
            System.out.println(RED + "L'equazione non ha soluzioni reali.");
        }
        scanner.close();
    }
}