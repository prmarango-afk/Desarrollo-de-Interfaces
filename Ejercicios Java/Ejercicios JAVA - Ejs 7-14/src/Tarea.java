import java.util.ArrayList;

public class Tarea {
    private String titulo;
    private String descripcion;
    private boolean completada;
    private Prioridad prioridad;


    public Tarea(String titulo, String descripcion, boolean completada){

        this.titulo = titulo;
        this.descripcion = descripcion;
        this.completada = completada;
        this.prioridad = Prioridad.MEDIA;

    };

    public Tarea(String titulo, String descripcion, boolean completada, Prioridad prioridad){

        this.titulo = titulo;
        this.descripcion = descripcion;
        this.completada = completada;
        this.prioridad = prioridad;

    };

    public String getTitulo() {
       return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public Prioridad getPrioridad(){ return prioridad; }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion){
        this.descripcion =descripcion;
    }

    public void completar(){
        completada = true;
    }

    public void setPrioridad( Prioridad prioridad) { this.prioridad = prioridad; }

    @Override
    public String toString(){
        return("Titulo: "+titulo+" Descripcion: "+descripcion+" Completada: "+completada+" Prioridad: "+prioridad);
    }

}

