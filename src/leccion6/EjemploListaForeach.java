package leccion6;

import utilitarios.UtilitariosGenerales;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public class EjemploListaForeach {

    public void listaForEach() {
        List<Integer> listaNumeros = new ArrayList<>(
            List.of(5, 4, 3, 8, 0)
        );
        listaNumeros.forEach(numero -> System.out.println(numero * 2));
    }

    public void listaForEachReferenciaAMetodoEstatico() {
        List<Integer> listaNumeros = new ArrayList<>(List.of(5, 4, 3, 8, 0));
        listaNumeros.forEach(System.out::println);
    }

    public void listaForEachReferenciaAMetodoDeObjeto() {
        Impresora impresora = new Impresora();
        List<String> mensajes = Arrays.asList("Hola", "Bienvenido", "Adiós");
        mensajes.forEach(impresora::imprimirMensaje);
        // mensajes.forEach(mensaje -> impresora.imprimirMensaje(mensaje));
    }

    public void referenciaAMetodoTipoConstructor() {
        // Forma 1: Clase interna anonima
        Supplier<String> constructorAnonimo = new Supplier<String>() {
            @Override
            public String get() {
                return new String();
            }
        };
        // Forma 2: Expresion lambda
        Supplier<String> constructorLambda = () -> new String();
        // Forma 3: Referencia a metodo
        Supplier<String> constructor = String::new;

        String[] arreglo = new String[5];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = constructorLambda.get().concat(""+i);
            System.out.println(arreglo[i]);
        }
    }
    public static void main(String[] args) {
        EjemploListaForeach ejemplo = new EjemploListaForeach();
        ejemplo.listaForEach();
        UtilitariosGenerales.imprimirLineasSeparacion();
        ejemplo.listaForEachReferenciaAMetodoEstatico();
        UtilitariosGenerales.imprimirLineasSeparacion();
        ejemplo.listaForEachReferenciaAMetodoDeObjeto();
        UtilitariosGenerales.imprimirLineasSeparacion();
        ejemplo.referenciaAMetodoTipoConstructor();
    }
}

class Impresora {
    public void imprimirMensaje(String mensaje) {
        System.out.println("Impresora dice: " + mensaje);
    }
}