package leccion4;

import java.util.Iterator;
import java.util.List;

public class PistolaParaIniciarCarreras {

    public void disparar(List<Nadador> listaNadadores) {
        for (Nadador nadador : listaNadadores) {
            nadador.nadar();
        }
    }
}
