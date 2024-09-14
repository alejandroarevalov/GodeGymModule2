package utilitarios;

public class Automovil extends Vehiculo {

    private short cilindrajeEnCentimetrosCubicos = 2048;
    private boolean tieneTurbo = false;

    public Automovil() {
        System.out.println("Inicializando automóvil");
        System.out.println(String.format("Cilindraje: %d c.c, Tiene turbo: %s",
            cilindrajeEnCentimetrosCubicos, tieneTurbo));
    }

    public short getCilindrajeEnCentimetrosCubicos() {
        return this.cilindrajeEnCentimetrosCubicos;
    }

    public void setCilindrajeEnCentimetrosCubicos(short cilindrajeEnCentimetrosCubicos) {
        this.cilindrajeEnCentimetrosCubicos = cilindrajeEnCentimetrosCubicos;
    }

    public boolean tieneTurbo() {
        return tieneTurbo;
    }

    public void setTieneTurbo(boolean tieneTurbo) {
        this.tieneTurbo = tieneTurbo;
    }
}
