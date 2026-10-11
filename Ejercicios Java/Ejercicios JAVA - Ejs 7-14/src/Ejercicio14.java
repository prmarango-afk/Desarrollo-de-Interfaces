public class Ejercicio14 {
    public static void main (String[] args){
        Proyecto p2 = new Proyecto("Proyecto Di 2");

        p2.addTarea(new Tarea("PSP", "Empezar Programacion y Servicios", false, Prioridad.ALTA));
        p2.addTarea(new Tarea("SGE", "Sistemas de Gestión Empresarial", false, Prioridad.BAJA));
        p2.addTarea(new Tarea("AAD", "Comenzar proyecto AirTortilla", true, Prioridad.ALTA));
        p2.addTarea(new Tarea("DIN", "Acabar ejercicios Java 1-6", true, Prioridad.ALTA));
        p2.addTarea(new Tarea("ANGL", "Hacer actividad listening", false, Prioridad.MEDIA));

        Ejercicio8.mostrarTareas(p2.getTareas());
    }

}
