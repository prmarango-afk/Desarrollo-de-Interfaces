public class Ejercicio7 {
    public static void main(String[] args) {

        Tarea t4 = new Tarea("Kotlin", "Empezar Kotlin", false);
        System.out.println("Antes: "+ t4);
        t4.completar();
        System.out.println("Después: "+ t4);
    }
}
