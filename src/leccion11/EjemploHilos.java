package leccion11;

import java.util.Random;

public class EjemploHilos {

    public void crearHiloConUnRunnable() {
        MiEjecutableConRunnable ejecutable = new MiEjecutableConRunnable();
        Thread hilo = new Thread(ejecutable, "Nuevo Hilo");
        hilo.start();
        System.out.println();
    }

    public void crearHiloHeredandoLaClaseThread() {
        MiEjecutableHeredandoThread ejecutable = new MiEjecutableHeredandoThread(
            "Segundo hilo"
        );
        ejecutable.start();
    }

    public void crearHiloUsandoExpresionLambda() {
        // Runnable r = new Runnable() {
        //    public void run() {
        //        .......
        //    }
        // }
        Runnable ejecutable = () -> {
            try {
                for (int i = 100000000; i >= 0; i--) {
                    System.out.println(Thread.currentThread().getName()
                        + " imprime el numero: " + i);
                    Thread.sleep(2000);
                }
            } catch (InterruptedException ex) {
                System.err.println("Error en el hilo "
                    + Thread.currentThread().getName() + ": " + ex.getMessage());
            }
        };
        new Thread(ejecutable, "Hilo con lambda").start();
    }

    public void crearHiloParaInterrumpir() {
        new Thread(() -> {
            Random generadorAleatorios = new Random();
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println("Hilo aleatorio interrumpido: " + e.getMessage());
                }
                int ultimoAleatorio = generadorAleatorios.nextInt(100);
                System.out.println(Thread.currentThread().getName() +
                    " en ejecucion. Aleatorio generado: " + ultimoAleatorio);
                if (ultimoAleatorio >= 95) {
                    System.out.println("Hilo aleatorio interrumpido");
                    Thread.currentThread().interrupt();
                }
            }
        }, "Hilo de aleatorios").start();
    }

    public static void main(String[] args) {
        EjemploHilos ejemplo = new EjemploHilos();
        ejemplo.crearHiloConUnRunnable();
        ejemplo.crearHiloHeredandoLaClaseThread();
        ejemplo.crearHiloUsandoExpresionLambda();
        ejemplo.crearHiloParaInterrumpir();
        // Las operaciones siguentes siguen siendo parte del hilo principal
        try {
            for (int i = 0; i < 100000000; i++) {
                System.out.println(Thread.currentThread().getName()
                    + " imprime el numero: " + i);
                Thread.sleep(20000);
            }
        } catch (InterruptedException ex) {
            System.err.println("Error en el hilo "
                + Thread.currentThread().getName() + ": " + ex.getMessage());
        }
    }
}
