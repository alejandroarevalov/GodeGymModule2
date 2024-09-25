package leccion11;

import javax.swing.plaf.TableHeaderUI;

public class MiEjecutableConRunnable implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 100000000; i++) {
                System.out.println(Thread.currentThread().getName()
                    + " imprime el numero: " + i);
                if (i % 10 == 0) {
                    Thread.sleep(5000);
                }
            }
        } catch (InterruptedException ex) {
            System.err.println("Error en el hilo "
                + Thread.currentThread().getName() + ": " + ex.getMessage());
        }
    }
}
