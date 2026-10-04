import java.util.Scanner;

public class Ejercicio1 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Edad: ");
        int edad = sc.nextInt();

        System.out.println("Hola, "+ nombre + ". Tienes " + edad + " años.");

        int ageFive = edad + 5;

        System.out.println(nombre + ", tendrás " + ageFive + " años para 2031 (5años).");

    };
}
