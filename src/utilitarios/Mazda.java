package utilitarios;

public class Mazda extends Automovil {

    private int asientos = 4;
    private String placa = "HTS725";

    public Mazda(int numeroAsientos, String placa) {
        this.asientos = numeroAsientos;
        this.placa = placa;
        System.out.println("Inicializando Mazda...");
        this.setTieneTurbo(true);
        System.out.println();
    }
}
