package leccion13;

public class EjemploThreadGroup {
    public static void main(String[] args) {
        ThreadGroup grupo = new ThreadGroup("Grupo de Ejemplo");

        Thread hilo1 = new Thread(grupo, new TareaSimple(), "Hilo 1");
        Thread hilo2 = new Thread(grupo, new TareaSimple(), "Hilo 2");
        Thread hilo3 = new Thread(grupo, new TareaSimple(), "Hilo 3");

        Thread hilo4 = new Thread(new TareaSimple(), "Hilo 4");

        grupo.setMaxPriority(Thread.MIN_PRIORITY);
        hilo4.setPriority(Thread.MAX_PRIORITY);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

        try {
            System.out.println("Los hilos han iniciado su trabajo");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrumpir todos los hilos en el grupo
        System.out.println("Interrumpiendo todos los hilos del grupo...");
        grupo.interrupt();
        System.out.println("Hilo principal terminado...");
    }
}

