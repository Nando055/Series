import java.util.Date;

public class Temporada {

    private String fechaEstreno;

    private String fechaProduccion;

    private Integer numero;
    
    private Serie serie;

    public Temporada() {
        Serie serie=new Serie();
    }

    public Temporada(String fechaEstreno, String fechaProduccion, int capitulos, Serie serie) {
        this.fechaEstreno = fechaEstreno;
        this.fechaProduccion = fechaProduccion;
        this.numero = numero;
        this.serie = serie;
    }

    public String getFechaEstreno() {
        return fechaEstreno;
    }

    public String getFechaProduccion() {
        return fechaProduccion;
    }

    public int getNumero() {
        return numero;
    }

    public void setFechaEstreno(String fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public void setFechaProduccion(String fechaProduccion) {
        this.fechaProduccion = fechaProduccion;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
