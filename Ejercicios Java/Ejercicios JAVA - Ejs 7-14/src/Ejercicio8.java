import java.util.ArrayList;
public class Ejercicio8 {
    public static void main(String[] args) {
        ArrayList<Tarea> tareas = new ArrayList<>();
        tareas.add(new Tarea("PSP", "Empezar Programación y Servicios", false));
        tareas.add(new Tarea("SGE", "Sistemas de Gestión Empresarial", false));
        tareas.add(new Tarea("AAD", "Comenzar proyecto AirTortilla", true));
        tareas.add(new Tarea("DIN", "Acabar ejercicios Java 1-6", true));
        tareas.add(new Tarea("ANGL", "Hacer actividad listening", false));

        mostrarTareas(tareas);

    }

    public static void mostrarTareas(ArrayList<Tarea> tareas){
        for(Tarea tarea : tareas){
            System.out.println(tarea.toString());
        }
    }
    
}

