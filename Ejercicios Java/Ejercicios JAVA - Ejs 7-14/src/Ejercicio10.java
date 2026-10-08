import java.util.ArrayList;

public class Ejercicio10 {
    public static void main(String[] args) {

        ArrayList<Tarea> tareas = new ArrayList<>();
        tareas.add(new Tarea("PSP", "Empezar Programación y Servicios", false));
        tareas.add(new Tarea("SGE", "Sistemas de Gestión Empresarial", false));
        tareas.add(new Tarea("AAD", "Comenzar proyecto AirTortilla", true));
        tareas.add(new Tarea("DIN", "Acabar ejercicios Java 1-6", true));
        tareas.add(new Tarea("ANGL", "Hacer actividad listening", false));

        ArrayList<Tarea> tareasEncontradas = buscarPorTitulo(tareas, "PSP");
        Ejercicio8.mostrarTareas(tareasEncontradas);
    }

    public static ArrayList<Tarea> buscarPorTitulo(ArrayList<Tarea> tareas, String texto){
        ArrayList<Tarea> tareasEncontradas = new ArrayList<>();
        for (Tarea tarea : tareas){
            String titulo = tarea.getTitulo();
            if ((titulo.toLowerCase().contains(texto.toLowerCase()))) {
                tareasEncontradas.add(tarea);
            }
        }
        return tareasEncontradas;
    }
}
