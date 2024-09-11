package leccion7;

import utilitarios.Animal;
import utilitarios.Persona;
import utilitarios.UtilitariosGenerales;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EjemploSwitch {

    public void usarSwitchAntiguo(String fruta) {
        int numeroAretornar = 0;
        switch (fruta) {
            case "Manzana":
                numeroAretornar = 1;
                System.out.println("Es una manzana");
                break;
            case "Naranja":
                numeroAretornar = 2;
                System.out.println("Es una naranja");
                break;
            case "Plátano":
                numeroAretornar = 3;
                System.out.println("Es un plátano");
                break;
            default:
                numeroAretornar = -1;
                System.out.println("Fruta no reconocida");
        }
        System.out.println(numeroAretornar);
    }

    public void usarNuevoSwitchJava14(Integer dia) {
        String resultado = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> {
                System.out.println("Procesando miércoles...");
                yield "Miércoles";  // "yield" es la forma de retornar un valor dentro de un bloque
            }
            case 4 -> "Es jueves";
            case 5, 6, 7 -> { // if (dia == 5 || dia == 6 || dia == 7)
                System.out.println("Que comience el fin de semana...");
                String[] dias = {"Viernes", "Sábado", "Domingo"};
                yield "Mi fiesta empieza el Viernes y termina el " + dias[dia-5];
            }
            default -> "Día inválido";
        };
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        EjemploSwitch ejemplo = new EjemploSwitch();
        ejemplo.usarSwitchAntiguo("Plátano");
        UtilitariosGenerales.imprimirLineasSeparacion();
        ejemplo.usarNuevoSwitchJava14(2);
    }
}
