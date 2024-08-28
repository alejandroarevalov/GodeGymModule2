package leccion3;

public class Portada {

    private String titulo;
    private String escritor;
    private String editorial;

    public Portada(String titulo, String escritor, String editorial) {
        this.titulo = titulo;
        this.escritor = escritor;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
