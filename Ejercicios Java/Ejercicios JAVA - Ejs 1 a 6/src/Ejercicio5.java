 import java.util.Scanner;
 public class Ejercicio5 {
     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         String[] tareas = {"Estudiar Java", "Preparar práctica", "Revisar ejercicios", "Subir proyecto"};
         System.out.println("Que tarea desea buscar? :");
         String texto = sc.nextLine();

         int posicion = buscarTarea(tareas, texto);
         System.out.println(posicion);

     }

     ;

     public static int buscarTarea(String[] tareas, String texto) {

         for(int i = 0; i < tareas.length; i++){


             if(tareas[i].equals(texto)){
                 return i;
             }
         }

         return -1;
     };
 }

