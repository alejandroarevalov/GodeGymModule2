package leccion12;

public class EjemploDeadLock {
    public static void main(String[] args) {
        // Crear dos recursos
        Recurso recursoA = new Recurso("Recurso A");
        Recurso recursoB = new Recurso("Recurso B");

        // Crear dos hilos que intentan bloquear los recursos en orden inverso
        Thread hilo1 = new Thread(new ProcesoBloqueo(recursoA, recursoB), "Hilo 1");
        Thread hilo2 = new Thread(new ProcesoBloqueo(recursoB, recursoA), "Hilo 2");

        // Iniciar ambos hilos
        hilo1.start();
        hilo2.start();
    }
}