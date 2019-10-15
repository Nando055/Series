public class Serie {

    private String titulo;

    private String sinopsis;

    private String genero;

    private Personaje personaje;

    private String año;

    public Serie(){}

    public Serie(String titulo, String sinopsis, String genero, Personaje personaje, String año) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.genero = genero;
        this.personaje = personaje;
        this.año=año;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getGenero() {
        return genero;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public String getAño(){
        return año;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje =personaje;
    }

    public void setAño(String año){
        this.año=año;
    }

    public void untitledMethod() {
    }
}