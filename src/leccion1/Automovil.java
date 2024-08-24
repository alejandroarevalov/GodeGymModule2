package leccion1;

import java.util.Objects;

public class Automovil extends Vehiculo {

    private String marca;
    private TipoTransmision tipoTransmision;

    public Automovil(String marca, TipoTransmision tipoTransmision) {
        this.marca = marca;
        this.tipoTransmision = tipoTransmision;
    }

    public void girar(String direccion) {
        // if .... VALIDACION PREVIA
        super.girar(direccion);
        if (!(Objects.equals(direccion.toLowerCase(), "left") || Objects.equals(direccion.toLowerCase(), "right"))) {
            System.out.println("Invalid turn direction");
            detener();
            return;
        }
        System.out.println(String.format("Going to the %s", direccion));
    }
}
