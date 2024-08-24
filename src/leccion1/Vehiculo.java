package leccion1;

import java.util.Objects;

public class Vehiculo {

    private int velocidadActual;

    public void arrancar() {
        velocidadActual = 15;
        System.out.println("El vehículo está en movimiento");
        imprimirVelocidadActual();

    }

    public void detener() {
        velocidadActual = 0;
        System.out.println("El vehículo está detenido");
        imprimirVelocidadActual();
    }

    public void girar(String direccion) {

        if (!(Objects.equals(direccion.toLowerCase(), "izquierda") || Objects.equals(direccion.toLowerCase(), "derecha"))) {
            System.out.println("Dirección de giro inválida");
            detener();
            return;
        }
        System.out.println(String.format("Girando a la %s", direccion));
    }


    private Integer imprimirVelocidadActual() {
        System.out.println(String.format("El vehículo tiene una velocidad actual de %d Kms/h", this.velocidadActual));
        return velocidadActual;
    }

    public void setVelocidadActual(int nuevaVelocidadActual) {
        if (nuevaVelocidadActual < 0 || nuevaVelocidadActual > 100000) {
            System.out.println("Velocidad invalidad");
        } else {
            this.velocidadActual = nuevaVelocidadActual;
        }
    }

    public int getVelocidadActual() {
        return this.velocidadActual;
    }
}
