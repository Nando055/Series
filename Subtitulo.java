public class Subtitulo {

    private String idioma;

    private String autor;

    public Subtitulos() {
    }

    public Subtitulo(String idioma, String autor) {
        this.idioma = idioma;
        this.autor = autor;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getAutor() {
        return autor;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
