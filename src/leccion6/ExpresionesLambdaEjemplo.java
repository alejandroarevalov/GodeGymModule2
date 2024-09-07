package leccion6;

import utilitarios.UtilitariosGenerales;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExpresionesLambdaEjemplo {

    public void expresionLambda() {
        Comparator<String> comparable = (String s1, String s2) -> {
            return s1.length() - s2.length();
        };
        List<String> nombres = new ArrayList<>(List.of("Alejandro", "Manuel", "Juan", "Camilo", "Santiago"));
        Collections.sort(nombres, comparable);
        System.out.println(nombres);
    }

    public void expresionLambaReducida() {
        Comparator<String> comparable = (s1, s2) -> {
            return s1.length() - s2.length();
        };
        List<String> nombres = new ArrayList<>(List.of("Alejandro", "Manuel", "Juan", "Camilo", "Santiago"));
        Collections.sort(nombres, comparable);
        System.out.println(nombres);
    }

    public void expresionLambdaReducidaSinCuerpo() {
        Comparator<String> comparable = (s1, s2) -> s1.length() - s2.length();
        List<String> nombres = new ArrayList<>(
            List.of("Alejandro", "Manuel", "Juan", "Camilo", "Santiago")
        );
        Collections.sort(nombres, comparable);
        System.out.println(nombres);
    }

    public void expresionLambdaReducidaEnLineareducida() {
        List<String> nombres = new ArrayList<>(
            List.of("Alejandro", "Manuel", "Juan", "Camilo", "Santiago")
        );
        Collections.sort(nombres, (s1, s2) -> s1.compareTo(s2));
        System.out.println(nombres);
    }


    public static void main(String[] args) {
        ExpresionesLambdaEjemplo ejemplo = new ExpresionesLambdaEjemplo();
        ejemplo.expresionLambda();
        UtilitariosGenerales.imprimirLineasSeparacion();
        ejemplo.expresionLambaReducida();
        UtilitariosGenerales.imprimirLineasSeparacion();
        ejemplo.expresionLambdaReducidaSinCuerpo();
        UtilitariosGenerales.imprimirLineasSeparacion();
        ejemplo.expresionLambdaReducidaEnLineareducida();
    }
}
