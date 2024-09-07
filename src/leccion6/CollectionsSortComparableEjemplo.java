package leccion6;

import utilitarios.UtilitariosGenerales;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsSortComparableEjemplo {

    public void ordenarLista() {
        List<String> nombres = new ArrayList<>(
            List.of("Alejandro", "Manuel", "Juan", "Camilo", "Santiago")
        );
        Collections.sort(nombres);
        System.out.println(nombres);
    }

    public void ordenarListaConComparador() {
        List<String> nombres = new ArrayList<>(
            List.of("Alejandro", "Manuel", "Juan", "Camilo", "Santiago")
        );
        Collections.sort(nombres, new ComparadorNombres());
        System.out.println(nombres);
    }

    public void ordenarListaConComparadorDeClaseInternaAnonima() {
        List<String> nombres = new ArrayList<>(
            List.of("Alejandro", "Manuel", "Juan", "Camilo", "Santiago")
        );
        Comparator<String> comparadorClaseInternaAnonimaLexicografico = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };

        Comparator<String> comparadorClaseInternaAnonimaLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };
        Collections.sort(nombres, comparadorClaseInternaAnonimaLongitud);
        System.out.println(nombres);
    }

    public static void main(String[] args) {
        CollectionsSortComparableEjemplo ejemplo = new CollectionsSortComparableEjemplo();
        ejemplo.ordenarLista();
        UtilitariosGenerales.imprimirLineasSeparacion();
        ejemplo.ordenarListaConComparador();
        UtilitariosGenerales.imprimirLineasSeparacion();
        ejemplo.ordenarListaConComparadorDeClaseInternaAnonima();
    }
}
