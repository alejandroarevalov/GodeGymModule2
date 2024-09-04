package leccion5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GenericosEjemplo1 {

    public void problemaListaEnCrudo() {
        List listaObjetos = new ArrayList();
        listaObjetos.add("Hola");
        listaObjetos.add("Mundo");
        listaObjetos.add(3);
        System.out.println(listaObjetos);
        // Fallará al intentar convertir un entero a mayúsculas
        try {
            for (Object x : listaObjetos) {
                String cadena = (String) x;
                System.out.println(cadena.toUpperCase());
            }
        } catch (ClassCastException ex) {
            System.err.println(ex);
        }

    }

    public void solucionProblemaListaEnCrudo() {
        List<String> listaObjetos = new ArrayList<>();
        listaObjetos.add("Hola");
        listaObjetos.add("Mundo");
        listaObjetos.add(String.valueOf(3));
        System.out.println(listaObjetos);
        for (String elementoDeLista : listaObjetos) {
            System.out.println(elementoDeLista.toUpperCase());
        }
    }

    public static void main(String[] args) {
        GenericosEjemplo1 ejemplo = new GenericosEjemplo1();
        ejemplo.problemaListaEnCrudo();
        ejemplo.solucionProblemaListaEnCrudo();
    }
}
