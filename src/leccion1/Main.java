package leccion1;

public class Main {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.arrancar();
        vehiculo.girar("izquierda");
        vehiculo.detener();

        Vehiculo auto = new Automovil("BMW", TipoTransmision.AUTOMATICA);
        auto.arrancar();
        auto.girar("Left");
        auto.detener();

        Motocicleta moto = new Motocicleta();
        moto.arrancar();
        moto.detener();

        Persona andres = new Persona(moto);
        andres.comprarVehiculo(auto);

        moto.girar("Al cielo");
        moto.setVelocidadActual(-50);
        moto.arrancar();
        System.out.println(moto.getVelocidadActual());

    }
}