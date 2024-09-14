package utilitarios;

public class Vehiculo {

    private boolean tieneMotor = false;
    private Color color = Color.ROJO;

    public Vehiculo () {
        System.out.println("Inicializando vehiculo");
        System.out.println(String.format("Tiene motor: %s, Color: %s", tieneMotor, color));
    }

}
