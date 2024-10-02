package leccion13.metodofabrica;

public class TareaConString implements Runnable {
    private String nombre;

    public TareaConString(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        System.out.println("Ejecutando: " + nombre + " en " + Thread.currentThread().getName());
    }
}
