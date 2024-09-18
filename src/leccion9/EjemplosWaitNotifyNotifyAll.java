package leccion9;

import java.lang.management.ThreadInfo;
import java.util.Random;

public class EjemplosWaitNotifyNotifyAll {

    public void crearHilo() {
        Runnable loQueSeEjecutaDentroDelHilo = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " los saluda...");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Thread hilo = new Thread(loQueSeEjecutaDentroDelHilo, "nuevo hilo");
        hilo.start();
    }

    public void ejemplosWaitNotifyYNotifyAll() {
        RecursoCompartido recursoCompartido = new RecursoCompartido("XXX", 0);

        Thread hilo0 = new Thread(() -> {
            Random random = new Random();
            int valor = random.nextInt(100);
            if (valor <= 95) {
                recursoCompartido.esperar();
            }
            recursoCompartido.cambiarRecursoCompartido("AAA", 111);
            System.out.println(recursoCompartido);
            recursoCompartido.despertar();
        }, "hilo0");

        Thread hilo1 = new Thread(() -> {
            try {
                Thread.currentThread().sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Random random = new Random();
            int valor = random.nextInt(100);
            if (valor <= 75) {
                recursoCompartido.esperar();
            }
            recursoCompartido.cambiarRecursoCompartido("BBB", 222);
            System.out.println(recursoCompartido);
            recursoCompartido.despertar();

        }, "hilo1");

        Thread hilo2 = new Thread(() -> {
            try {
                Thread.currentThread().sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            recursoCompartido.cambiarRecursoCompartido("CCC", 333);
            System.out.println(recursoCompartido);
            recursoCompartido.despertar();
        }, "hilo2");

        hilo0.start();
        hilo1.start();
        hilo2.start();
    }

    public static void main(String[] args) {
        EjemplosWaitNotifyNotifyAll ejemplo = new EjemplosWaitNotifyNotifyAll();
        ejemplo.crearHilo();
        try {
            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread().getName() + " los saluda...");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ejemplo.ejemplosWaitNotifyYNotifyAll();
    }
}
