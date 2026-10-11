public class Ejercicio12 {
   public static void main (String[] args){

       Proyecto p1 = new Proyecto("Proyecto Di");

       p1.addTarea(new Tarea("PSP", "Empezar Programación y Servicios", false));
       p1.addTarea(new Tarea("SGE", "Sistemas de Gestión Empresarial", false));
       p1.addTarea(new Tarea("AAD", "Comenzar proyecto AirTortilla", true));
       p1.addTarea(new Tarea("DIN", "Acabar ejercicios Java 1-6", true));
       p1.addTarea(new Tarea("ANGL", "Hacer actividad listening", false));

       System.out.println("TAREAS DEL " + p1.getNombre());
       Ejercicio8.mostrarTareas(p1.getTareas());

   }
}
