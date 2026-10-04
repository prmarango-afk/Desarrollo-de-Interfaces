import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Precio :");
        double precio = sc.nextDouble();

        System.out.println("Cantidad :");
        int cantidad = sc.nextInt();

        System.out.println("Descuento(%) :");
        double descuento = sc.nextDouble();

        double subtotal = (precio*cantidad);
        System.out.println("Subtotal: "+subtotal);

        double cantidad_descontada = (subtotal * descuento)/100;
        System.out.println("Descuento: "+cantidad_descontada);

        double total = subtotal - cantidad_descontada;
        System.out.println("Total: "+total);
    }
}
