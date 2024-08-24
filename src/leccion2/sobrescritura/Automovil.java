package leccion2.sobrescritura;

public class Automovil extends Vehiculo {

    @Override
    public void iniciar() {
        System.out.println("El automovil está encendido");
    }
}
