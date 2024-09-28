package leccion12;

import leccion8.Juego;

import java.lang.management.ThreadInfo;
import java.util.concurrent.Callable;

public class EjemploHiloConJoin {

    private ProcesoConJoin procesoConJoin;

    public EjemploHiloConJoin() {
        procesoConJoin = new ProcesoConJoin();
    }

    public void iniciarHilosSinJoin() {
        Thread t1 = new Thread(procesoConJoin, "Hilo 1");
        t1.start();
    }

    public void iniciarHilosConJoin() {
        Thread t1 = new Thread(procesoConJoin, "Hilo 1");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.err.println("Hilo 1 interrumpido...");
        }
    }
    public static void main(String[] args) {
        EjemploHiloConJoin ejemplo = new EjemploHiloConJoin();
        ejemplo.iniciarHilosConJoin();
        System.out.println(Thread.currentThread().getName() + " terminado!");
    }
}
