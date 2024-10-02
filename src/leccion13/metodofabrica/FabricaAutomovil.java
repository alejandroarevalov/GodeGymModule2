package leccion13.metodofabrica;

public class FabricaAutomovil extends FabricaVehiculo {
    @Override
    public Vehiculo crearVehiculo() {
        return new Automovil();
    }
}
