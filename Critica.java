
import java.util.Date;

public class Critica {

    private String comentario;

    private Date fechaComentario;

    public Critica(){}
    
    public Critica(String comentario, Date fechaComentario) {
        this.comentario = comentario;
        this.fechaComentario = fechaComentario;
    }

    public String getComentario() {
        return comentario;
    }

    public Date getFechaComentario() {
        return fechaComentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setFechaComentario(Date fechaComentario) {
        this.fechaComentario = fechaComentario;
    }
}