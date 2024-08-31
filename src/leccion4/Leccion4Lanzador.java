package leccion4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leccion4Lanzador {

    public static void main(String[] args) {
        Clavadista clavadista = new Clavadista();
        clavadista.saltarAlAguaDesdeAltura(3);
        clavadista.nadar(4);
        clavadista.verDebajoDelAgua();

        Ballena ballena = new Ballena();
        ballena.nadar();

        List<Integer> listaEnteros = new ArrayList<>();
        List<Integer> lista2 = new LinkedList<>();

        System.out.println("===".repeat(40));

        List<Nadador> listaFinal = List.of(clavadista, ballena, new Pulpo());
        PistolaParaIniciarCarreras pistola = new PistolaParaIniciarCarreras();
        pistola.disparar(listaFinal);

        System.out.println("===".repeat(40));

        List<Automovil> listAutomoviles = List.of(new BMW(), new MercedesBenz(), new Audi(), new Tesla());
        for (Automovil automovil : listAutomoviles) {
            automovil.cargarCombustible((int)(Math.random() * 10));
        }

        System.out.println(Automovil.CREADOR);
    }
}
