import java.util.ArrayList;

public class Proyecto {
    private String nombre;
    private ArrayList<Tarea> listaTareas;

    public Proyecto(String nombre){
        this.nombre = nombre;
        this.listaTareas = new ArrayList<>();
    }

    public void addTarea(Tarea tarea){
        listaTareas.add(tarea);
    }

    public void removeTarea(Tarea tarea){
        listaTareas.remove(tarea);
    }

    public String getNombre(){
        return nombre;
    }

    public ArrayList<Tarea> getTareas() {
        return listaTareas;
    }

    public int getNumeroTareas(){
        return listaTareas.size();
    }

    public int getNumeroCompletadas(){
        int numTareasCompletadas = 0;

        for (Tarea tarea : listaTareas){
            if (tarea.isCompletada()){
                numTareasCompletadas++;
            }
        }

        return numTareasCompletadas;
    }

    public int getNumeroPendientes(){
        return getNumeroTareas() - getNumeroCompletadas();
    }
}