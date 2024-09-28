package leccion12;

public class ProcesoBloqueo implements Runnable {
    private Recurso recurso1;
    private Recurso recurso2;

    public ProcesoBloqueo(Recurso recurso1, Recurso recurso2) {
        this.recurso1 = recurso1;
        this.recurso2 = recurso2;
    }

    @Override
    public void run() {
        try {
            // Intentar bloquear el recurso1
            synchronized (recurso1) {
                System.out.println(Thread.currentThread().getName() + " ha bloqueado " + recurso1.getNombre());
                Thread.sleep(100);
                // Intentar bloquear el recurso2
                synchronized (recurso2) {
                    System.out.println(Thread.currentThread().getName() + " ha bloqueado " + recurso2.getNombre());
                }
            }
        } catch (InterruptedException e) {
            System.err.println("El hilo fue interrumpido.");
        }
    }
}