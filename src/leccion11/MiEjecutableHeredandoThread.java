package leccion11;

public class MiEjecutableHeredandoThread extends Thread {


    public MiEjecutableHeredandoThread(String nombreDeHilo) {
        this.setName(nombreDeHilo);
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
            " se ha iniciado...");
        for (int i = 100000000; i >= 0; i--) {
            System.out.println(Thread.currentThread().getName()
                + " imprime el numero: " + i);
            if (i % 10 == 0) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException ex) {
                    System.err.println("Error en el hilo "
                        + Thread.currentThread().getName() + ": " + ex.getMessage());
                }
            }
        }
    }
}
