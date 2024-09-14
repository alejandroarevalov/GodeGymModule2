package leccion8;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Juego {

    private static int cantidadJugadores = 2;
    private static String[] nombres = {"Jugador1", "Jugador2"};

    static {
        Properties p = new Properties();
        try {
            p.load(new FileInputStream("resources/jugadores.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        cantidadJugadores = Integer.parseInt(p.getProperty("jugadores-permitidos"));
        nombres = new String[cantidadJugadores];
        for (int i = 0; i < cantidadJugadores; i++) {
            String propiedad = "nombre".concat(String.valueOf(i + 1));
            nombres[i] = p.getProperty(propiedad);
        }
        System.out.println("Bloque estatico ejecutado: Clase cargada en memoria");
    }
    public Juego() {
        System.out.println(String.format("Cantidad de jugadores: %d", cantidadJugadores));
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(String.format("Jugador %d: %s", (i+1), nombres[i]));
        }
    }
}
