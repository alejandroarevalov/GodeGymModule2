package leccion17;

import java.util.Random;

public class Futbolista implements Deportista {

    private String nombre;
    private int dorsal;
    private String posicion;

    public static String seleccion = "COLOMBIA";

    public Futbolista() {
    }

    public Futbolista(String nombre, Integer dorsal, String posicion) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    private Futbolista(Futbolista futbolista) {
        this.nombre = futbolista.getNombre();
        this.dorsal = futbolista.getDorsal();
        this.posicion = futbolista.getPosicion();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void manejarBalon() {
        System.out.println(nombre + " lleva la pelota...");
    }

    public int getCantidadPasesEntregados() {
        return new Random().nextInt(100);
    }

    public void realizarPase(Futbolista otroFutbolista) {
        System.out.println(this.nombre + " le pasa la pelota a " + otroFutbolista.nombre);
    }

    @Override
    public void correr() {
        System.out.println(this.nombre + " está corriendo...");
    }

    @Override
    public String toString() {
        return "Futbolista{" +
            "nombre='" + nombre + '\'' +
            ", dorsal=" + dorsal +
            ", posicion='" + posicion + '\'' +
            '}';
    }

}
