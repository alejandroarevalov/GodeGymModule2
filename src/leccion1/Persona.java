package leccion1;

public class Persona {

    Vehiculo vehiculo;

    public Persona(Vehiculo vehiculo) {

    }

    public void comprarVehiculo(Vehiculo vehiculoComprado) {
        this.vehiculo = vehiculoComprado;
        System.out.println(String.format("Vehículo comprado: %s", vehiculoComprado.getClass().getCanonicalName()));
    }

    public void regalarVehiculoAOtraPersona() {
        Vehiculo vehiculo = new Vehiculo();
    }
}
