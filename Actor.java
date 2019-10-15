public class Actor {

    private String codigo;

    private String nombre;

   public Actor(){}
    
    public Actor(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}