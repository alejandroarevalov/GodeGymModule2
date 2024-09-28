package leccion12;
public class EjemploHiloConYield {
    public static void main(String[] args) {
        // Crear 10 hilos que usan Thread.yield
        Thread[] hilos = new Thread[10];
        for (int i = 0; i < 10; i++) {
            hilos[i] = new Thread(new ProcesoConYield("Hilo " + (i+1)));
        }
        for (int i = 0; i < 10; i++) {
            hilos[i].start();
        }
    }
}
