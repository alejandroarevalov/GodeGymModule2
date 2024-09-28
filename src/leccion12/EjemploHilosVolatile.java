package leccion12;
public class EjemploHilosVolatile {

    private Proceso proceso;

    public EjemploHilosVolatile() {
        proceso = new Proceso();
    }

    public void ejecutarEjemploSinVolatile() {
        Runnable r1 = () -> proceso.ejecutarProceso();
        Runnable r2 = () -> proceso.detenerProceso();
        Thread t1 = new Thread(r1, "Hilo 1");
        Thread t2 = new Thread(r2, "Hilo 2");
        System.out.println("Iniciando Hilo 1...");
        t1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            System.err.println("Error en la interrupción del hilo " + Thread.currentThread().getName());
        }
        System.out.println("Iniciando Hilo 2...");
        t2.start();
    }
    public static void main(String[] args) {
        EjemploHilosVolatile ejemplo = new EjemploHilosVolatile();
        ejemplo.ejecutarEjemploSinVolatile();
    }
}
