public class Personaje {

    private String nombreArtistico;
    
    private String codigo;

    public Personaje(){}
    
    public Personaje(String nombreArtistico, String codigo) {
    this.nombreArtistico=nombreArtistico;
    this.codigo=codigo;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }
    
    public String getCodigo(){
        return codigo;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }
    
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }                                   
}