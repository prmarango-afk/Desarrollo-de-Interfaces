public class Tarea {
    private String titulo;
    private String descripcion;
    private boolean completada;


    public Tarea(String titulo, String descripcion, boolean completada){

        this.titulo = titulo;
        this.descripcion = descripcion;
        this.completada = completada;

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

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion){
        this.descripcion =descripcion;
    }

    @Override
    public String toString(){
        return("Titulo: "+titulo+" Descripcion: "+descripcion+" Completada: "+completada);
    }
}

