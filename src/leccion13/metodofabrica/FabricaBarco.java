package leccion13.metodofabrica;

public class FabricaBarco extends FabricaVehiculo {
    @Override
    public Vehiculo crearVehiculo() {
        return new Barco();
    }
}
