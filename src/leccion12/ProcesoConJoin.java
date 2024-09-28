package leccion12;

import java.util.Random;

public class ProcesoConJoin implements Runnable {

    @Override
    public void run() {
        Random random = new Random();
        System.out.println("Maximo aleatorio empieza en 0");
        int maximoAleatorio = 0;
        for (int i = 0; i < 2_000_000_000; i++) {
            int temporal = random.nextInt(2147_000_000);
            if (temporal > maximoAleatorio) {
                maximoAleatorio = temporal;
                System.out.println("Nuevo máximo aleatorio encontrado: " + maximoAleatorio);
            }
        }
    }
}
