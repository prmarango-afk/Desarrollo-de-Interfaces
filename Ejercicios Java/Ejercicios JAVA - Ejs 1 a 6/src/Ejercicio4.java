import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        String [] tareas = {"Estudiar Java", "Preparar práctica", "Revisar ejercicios", "Subir proyecto"};

        for(int i =0; i <tareas.length; i++){
            System.out.println((i+1) +". " + tareas[i]);
        }
    }
}
