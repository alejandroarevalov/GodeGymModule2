package leccion12;

public class EjemploHilosSyncronized {

    private Impresora impresora;

    public EjemploHilosSyncronized() {
        impresora = new Impresora();
    }

    public void hilosAccediendoAlTiempoAUnMetodo() {
        Runnable r1 = () -> impresora.imprimirNombreYEdad("Alejandro", 39);
        Runnable r2 = () -> impresora.imprimirNombreYEdad("Juliana", 34);
        Thread t1 = new Thread(r1, "Hilo 1");
        Thread t2 = new Thread(r2, "Hilo 2");
        t1.start();
        t2.start();
    }

    public void hilosAccediendoAlTiempoAUnMetodoConBloqueSincronizado() {
        Runnable r1 = () -> impresora.imprimirNombreYEdadConBloqueSincronizado("Alejandro", 39);
        Runnable r2 = () -> impresora.imprimirNombreYEdadConBloqueSincronizado("Juliana", 34);
        Thread t1 = new Thread(r1, "Hilo 1");
        Thread t2 = new Thread(r2, "Hilo 2");
        t1.start();
        t2.start();
    }

    public void hilosAccediendoAlTiempoAUnMetodoConMetodoSincronizado() {
        Runnable r1 = () -> impresora.imprimirNombreYEdadConMetodoSincronizado("Alejandro", 39);
        Runnable r2 = () -> impresora.imprimirNombreYEdadConMetodoSincronizado("Juliana", 34);
        Thread t1 = new Thread(r1, "Hilo 1");
        Thread t2 = new Thread(r2, "Hilo 2");
        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        EjemploHilosSyncronized ejemplo = new EjemploHilosSyncronized();
        // ejemplo.hilosAccediendoAlTiempoAUnMetodo();
        // ejemplo.hilosAccediendoAlTiempoAUnMetodoConBloqueSincronizado();
        ejemplo.hilosAccediendoAlTiempoAUnMetodoConMetodoSincronizado();
    }
}
