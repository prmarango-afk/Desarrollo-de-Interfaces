import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nivel de prioridad (1-3) :");

        if (!sc.hasNextInt()) {
            System.out.println("La prioridad no es válida");
            sc.close();
            return;
        };

        int prioridad = sc.nextInt();

        switch (prioridad) {
            case 1:
                System.out.println("Prioridad baja");
                break;

            case 2:
                System.out.println("Prioridad media");
                break;


            case 3:
                System.out.println("Prioridad alta");
                break;

            default:
                System.out.println("La prioridad no es válida");
                break;
        }

    }
}
