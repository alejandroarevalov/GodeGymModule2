package leccion9;

public class RecursoCompartido {

    private String cadenaCompartida;
    private Integer numeroCompartido;

    public RecursoCompartido(String cadenaCompartida, Integer numeroCompartido) {
        this.cadenaCompartida = cadenaCompartida;
        this.numeroCompartido = numeroCompartido;
    }

    public synchronized void esperar() {
        System.out.println(Thread.currentThread().getName() + " entra en reposo...");
        try {
            this.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void despertar() {
        System.out.println(Thread.currentThread().getName() + " despierta a los demas...");
        this.notifyAll();
    }

    public void cambiarRecursoCompartido(String nuevaCadena, Integer nuevoValor) {
        this.cadenaCompartida = nuevaCadena;
        this.numeroCompartido = nuevoValor;
    }

    @Override
    public synchronized String toString() {
        return "RecursoCompartido { cadenaCompartida = " + this.cadenaCompartida +
            ", numeroCompartido = " + this.numeroCompartido + "}";
    }
}
