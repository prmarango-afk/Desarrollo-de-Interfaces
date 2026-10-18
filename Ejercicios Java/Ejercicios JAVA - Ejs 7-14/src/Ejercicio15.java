import java.util.ArrayList;
import java.time.LocalDate;
public class Ejercicio15 {
    public static void main (String[]args){
        ArrayList<Tarea> coleccion = new ArrayList<Tarea>();

        coleccion.add(new Tarea("PSP", "Empezar Programacion y Servicios", false, Prioridad.ALTA));
        coleccion.add(new Tarea("SGE", "Sistemas de Gestión Empresarial", false, Prioridad.BAJA));
        coleccion.add(new Tarea("AAD", "Comenzar proyecto AirTortilla", true, Prioridad.ALTA));
        coleccion.add(new TareaUrgente("DIN", "Acabar ejercicios Java 1-6", true, Prioridad.ALTA, LocalDate.of(2026, 10, 18)));
        coleccion.add(new TareaUrgente("ANGL", "Hacer actividad listening", false, Prioridad.MEDIA, LocalDate.of(2026, 10, 22)));
        coleccion.add(new TareaUrgente("PMD", "Acabar mi primera app", true, Prioridad.ALTA, LocalDate.of(2026, 11, 1)));

        Ejercicio8.mostrarTareas(coleccion);
    }
}
