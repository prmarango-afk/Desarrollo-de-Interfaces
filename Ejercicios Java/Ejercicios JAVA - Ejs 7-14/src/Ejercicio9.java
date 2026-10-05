import java.util.ArrayList;

public class Ejercicio9 {

    public static void main(String[] args) {

        ArrayList<Tarea> tareas = new ArrayList<>();
        tareas.add(new Tarea("PSP", "Empezar Programación y Servicios", false));
        tareas.add(new Tarea("SGE", "Sistemas de Gestión Empresarial", false));
        tareas.add(new Tarea("AAD", "Comenzar proyecto AirTortilla", true));
        tareas.add(new Tarea("DIN", "Acabar ejercicios Java 1-6", true));
        tareas.add(new Tarea("ANGL", "Hacer actividad listening", false));

        eliminarTarea(1,tareas);

        Ejercicio8.mostrarTareas(tareas);
    }

    public static void eliminarTarea(int tarea, ArrayList<Tarea> tareas) {

        int tamanioArray = tareas.size();

        if(tarea >= 0 && tarea < tamanioArray){
            Tarea tareaEliminada = tareas.remove(tarea);
            System.out.println("La tarea " + tareaEliminada.getTitulo() + " ha sido eliminada.");

        }else{
            System.out.println("No existe ninguna tarea en esa posición");
        }

    }
}
