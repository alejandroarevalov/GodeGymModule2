package leccion13.metodofabrica;

public class FabricaMotocicleta extends FabricaVehiculo {
    @Override
    public Vehiculo crearVehiculo() {
        return new Motocicleta();
    }
}