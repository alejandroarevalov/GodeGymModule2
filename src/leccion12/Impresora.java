package leccion12;

public class Impresora {

    // Problemas de concurrencia
    public void imprimirNombreYEdad(String nombre, int edad) {
        System.out.println("Hola, a todos... ");
        System.out.println(String.format("Mi nombre es %s ", nombre));
        System.out.println("Y tengo");
        System.out.println(String.format("%d años", edad));
    }

    // Con semaforo de exclusion mutua
    public void imprimirNombreYEdadConBloqueSincronizado(String nombre, int edad) {
        System.out.println(Thread.currentThread().getName() + " inicia ejecucion...");
        synchronized (this) {
            System.out.println("Hola, a todos... ");
            System.out.println(String.format("Mi nombre es %s ", nombre));
            System.out.println("Y tengo");
            System.out.println(String.format("%d años", edad));
        }
    }

    public synchronized void imprimirNombreYEdadConMetodoSincronizado(String nombre, int edad) {
        System.out.println(Thread.currentThread().getName() + " inicia ejecucion...");
        System.out.println("Hola, a todos... ");
        System.out.println(String.format("Mi nombre es %s ", nombre));
        System.out.println("Y tengo");
        System.out.println(String.format("%d años", edad));
    }
}
