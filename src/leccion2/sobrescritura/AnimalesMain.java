package leccion2.sobrescritura;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimalesMain {

    public static void reproducirSonidosAnimales(List<Animal> listaAnimales) {
        Iterator<Animal> iterador = listaAnimales.iterator();
        while(iterador.hasNext()) {
            Animal actual = iterador.next();
            System.out.println(actual.hacerSonido());
        }
    }

    public static void main(String[] args) {
        List<Animal> listaReal = new ArrayList<>();
        listaReal.add(new Perro());
        listaReal.add(new Gato());
        listaReal.add(new Vaca());
        reproducirSonidosAnimales(listaReal);
    }
}
