package leccion5;

import java.util.Iterator;
import java.util.List;

public class Guerra<T> {

    public static void iniciarCombate(List<? extends Avatar> azules,
                                      List<? extends Avatar> rojos) {
        do {
            for (int i = 0; i < Math.min(azules.size(), rojos.size()); i++) {
                Avatar azul = azules.get(i);
                Avatar rojo = rojos.get(i);
                azul.mostrarEstadisticas();
                rojo.mostrarEstadisticas();
                azul.atacarFisicamente(rojo);
            }
            // Remover guerreros azules muertos
            Iterator<? extends Avatar> iteradorAzules = azules.iterator();
            while (iteradorAzules.hasNext()) {
                if (iteradorAzules.next().getVida() <= 0) {
                    iteradorAzules.remove();
                }
            }
            //
            Iterator<? extends Avatar> iteradorojos = rojos.iterator();
            while (iteradorojos.hasNext()) {
                if (iteradorojos.next().getVida() <= 0) {
                    iteradorojos.remove();
                }
            }
        } while(!azules.isEmpty() && !rojos.isEmpty());
        System.out.println("El equipo " + (rojos.isEmpty() ? "rojo " : "azul ") + "ha salido victorioso");
    }

    public static void agregarMiembrosAlEquipo(List<? super Luchador> luchadores) {
        luchadores.add(new Luchador("Camile"));
        /* Esto arroja error de compilacion;
        for (Avatar luchador : luchadores) {

        }
        */

    }

}
