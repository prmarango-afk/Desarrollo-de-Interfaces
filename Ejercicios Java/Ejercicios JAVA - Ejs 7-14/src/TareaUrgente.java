import java.time.LocalDate;
public class TareaUrgente extends Tarea{
    private LocalDate fechaLimite;

    public TareaUrgente(String titulo, String descripcion, boolean completada, Prioridad prioridad, LocalDate fechaLimite){
        super(titulo, descripcion, completada, prioridad);
        this.fechaLimite  = fechaLimite;
    }

    @Override
    public String toString(){
        return super.toString() + " Fecha limite: " + fechaLimite;
    }
}
