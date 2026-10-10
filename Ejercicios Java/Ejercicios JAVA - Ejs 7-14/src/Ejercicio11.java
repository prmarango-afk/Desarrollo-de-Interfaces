import java.util.ArrayList;

public class Ejercicio11 {
    public static void main(String[] args) {
        ArrayList<Tarea> tareas = new ArrayList<>();
        tareas.add(new Tarea("PSP", "Empezar Programación y Servicios", false));
        tareas.add(new Tarea("SGE", "Sistemas de Gestión Empresarial", false));
        tareas.add(new Tarea("AAD", "Comenzar proyecto AirTortilla", true));
        tareas.add(new Tarea("DIN", "Acabar ejercicios Java 1-6", true));
        tareas.add(new Tarea("ANGL", "Hacer actividad listening", false));

        System.out.println("TAREAS PENDIENTES");
        Ejercicio8.mostrarTareas(tareasPendientes(tareas));

        System.out.println("TAREAS COMPLETADAS");
        Ejercicio8.mostrarTareas(tareasCompletadas(tareas));

    }

    public static ArrayList<Tarea> tareasPendientes(ArrayList<Tarea> tareas){
        ArrayList<Tarea> tareasPendientes = new ArrayList<>();
        for (Tarea tarea : tareas){
            boolean completada = tarea.isCompletada();
            if(!completada) {
                tareasPendientes.add(tarea);
            }
        }
        return tareasPendientes;
    }

    public static ArrayList<Tarea> tareasCompletadas(ArrayList<Tarea> tareas){
        ArrayList<Tarea> tareasCompletadas = new ArrayList<>();
        for (Tarea tarea : tareas){
            boolean completada = tarea.isCompletada();
            if(completada) {
                tareasCompletadas.add(tarea);
            }
        }
        return tareasCompletadas;
    }
}
