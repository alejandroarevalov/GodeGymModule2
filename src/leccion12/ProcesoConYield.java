package leccion12;

public class ProcesoConYield implements Runnable {
    private final String nombre;

    public ProcesoConYield(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(nombre + " está ejecutando la iteración: " + i);
            // Sugerir al scheduler ceder el CPU a otros hilos de igual prioridad
            Thread.yield();
        }
        System.out.println(nombre + " ha terminado.");
    }
}