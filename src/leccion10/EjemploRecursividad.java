package leccion10;

import utilitarios.UtilitariosGenerales;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class EjemploRecursividad {

    public void ejecutarCuentaRegresiva(int inicioConteo) {
        if (inicioConteo <= 0) {
            System.out.println("Boom, estalló la bomba");
        } else {
            ejecutarCuentaRegresiva(inicioConteo - 1);
        };
    }

    // 0! = 1
    // 1! = 1
    // 2! = 1 * 2 = 2
    // 3! = 1 * 2 * 3 = 6
    // 4! = 1 * 2 * 3 * 4 = 24
    // 5! = 1 * 2 * 3 * 4 * 5 = 120
    public int calcularFactorial(int n) {
        if (n == 1) {
         return 1;
        } else {
            int factorialDelAnterior = calcularFactorial(n - 1);
            return factorialDelAnterior * n;
        }
    }

    public void imprimirTodosLosArchivos(String ruta){
        File fichero = new File(ruta);
        for (File actual : fichero.listFiles()){
            if (actual.isDirectory()) {
                imprimirTodosLosArchivos(actual.getAbsolutePath());
            }
            else {
                System.out.println(actual.getAbsolutePath());
            }
        }
    }

    public List<String> buscarArchivoEnCarpeta(String ruta, String nombreDeArchivo) {
        File fichero = new File(ruta);
        List<String> posiblesRutas = new ArrayList<>();
        for (File actual : fichero.listFiles()) {
            if (actual.isDirectory()) {
                posiblesRutas.addAll(
                    buscarArchivoEnCarpeta(actual.getAbsolutePath(), nombreDeArchivo)
                );
            } else {
                if (actual.getAbsolutePath().contains(nombreDeArchivo)) {
                    posiblesRutas.add(actual.getAbsolutePath());
                }

            }
        }
        return posiblesRutas;
    }
    public static void main(String[] args) {
        EjemploRecursividad ejemplo = new EjemploRecursividad();
        ejemplo.ejecutarCuentaRegresiva(3);
        System.out.println(ejemplo.calcularFactorial(5)); // 120
        ejemplo.imprimirTodosLosArchivos("D:\\CodeGym\\Module 1");
        UtilitariosGenerales.imprimirLineasSeparacion();
        System.out.println(
            ejemplo.buscarArchivoEnCarpeta("D:\\CodeGym",
                "thumbnail")
        );
    }
}
