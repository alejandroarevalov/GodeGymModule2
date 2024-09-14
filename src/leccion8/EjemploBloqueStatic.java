package leccion8;

import java.util.Scanner;

public class EjemploBloqueStatic {

    public void iniciar() throws InterruptedException {
        try(Scanner scanner = new Scanner(System.in);) {
            System.out.print("Deseas cargar los datos de archivo? (Y/N): ");
            String input = scanner.nextLine();
            if (input.equals("Y")) {
                Juego juego = new Juego();
                while (true) {
                    Thread.sleep(100L);
                }
            } else {
                System.out.println("No se ha inicializado la clase Juego");
                while (true) {
                    Thread.sleep(100L);
                }
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        EjemploBloqueStatic ejemplo = new EjemploBloqueStatic();
        ejemplo.iniciar();
    }
}
