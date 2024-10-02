package leccion13;

public class TareaSimple implements Runnable {
    @Override
    public void run() {
        String nombreHilo = Thread.currentThread().getName();
        ThreadGroup grupoHilos = Thread.currentThread().getThreadGroup();
        System.out.println("Hilo: " + nombreHilo + " en el grupo: " + grupoHilos.getName());

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(nombreHilo + " está trabajando");
            } catch (InterruptedException e) {
                System.out.println(nombreHilo + " ha sido interrumpido");
                break;
            }
        }
        System.out.println(nombreHilo + " ha terminado");
    }
}