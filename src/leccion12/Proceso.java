package leccion12;

public class Proceso {

    // Uso de volatile
    private volatile boolean cancelado = false;
    public void ejecutarProceso() {
        try {
            while (!cancelado) {
                for (int i = 0; i < 100_000_000; i++) {
                    //System.out.println(Thread.currentThread().getName() + " esta ejecutando el proceso...");
                    //System.out.println("Raiz cuadrada de " + i + ": " + Math.sqrt(i));
                    Math.sqrt(i);
                }
            }
        } catch (Exception ex) {
            System.err.println("Interrupción en la ejecución");
        }
    }

    public void detenerProceso() {
        System.out.println("Deteniendo proceso...");
        this.cancelado = true;
    }
}
