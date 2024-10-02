package leccion13.metodofabrica;

public class EjemploMetodoFabrica {
    public static void main(String[] args) {

        FabricaVehiculo fabricaCoche = new FabricaAutomovil();
        fabricaCoche.manejarVehiculo();

        FabricaVehiculo fabricaMoto = new FabricaMotocicleta();
        fabricaMoto.manejarVehiculo();

        FabricaBarco fabricaBarco = new FabricaBarco();
        fabricaBarco.manejarVehiculo();
    }
}
