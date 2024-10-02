package leccion13.metodofabrica;

public abstract class FabricaVehiculo {

    public abstract Vehiculo crearVehiculo();

    public void manejarVehiculo() {
        // Crea un vehículo usando el método factory
        Vehiculo vehiculo = crearVehiculo();
        vehiculo.iniciar();
    }
}

