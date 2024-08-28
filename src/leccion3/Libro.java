package leccion3;

import java.util.List;

public class Libro {

    private Portada portada;
    private List<Pagina> paginas;

    public Libro(Portada portada, List<Pagina> lasPaginas) {
        if (portada == null || lasPaginas == null || lasPaginas.isEmpty()) {
            throw new IllegalStateException("El libro debe contener portada y/o páginas");
        }
        this.portada = portada;
        this.paginas = lasPaginas;
    }

    public Portada getPortada() {
        return portada;
    }

    public List<Pagina> getPaginas() {
        return paginas;
    }
}
