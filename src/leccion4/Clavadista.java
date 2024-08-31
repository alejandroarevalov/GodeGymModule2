package leccion4;

public class Clavadista implements Nadador, ExploradorSubAcuatico, Buzo {

    @Override
    public void nadar() {
        System.out.println("Estoy nadando para salir de la piscina");
    }

    @Override
    public void nadar(int capacidadTanqueOxigenoEnLitros) {
        if (capacidadTanqueOxigenoEnLitros < 3) {
            System.out.println("Me ahogo...");
        } else {
            System.out.println("Nadando tranquilamente en las profundidades");
        }
    }

    @Override
    public void verDebajoDelAgua() {
        System.out.println("Me pongo las gafas/lentes para ver debajo del agua");
    }

    public void saltarAlAguaDesdeAltura(int altura) {
        int aleatorio = (int) (Math.random() * 10);
        if (altura > aleatorio) {
            System.out.println("Uy no, me da miedo saltar");
        } else {
            System.out.println("Saltando!!!... Splashhhh...");
        }
    }
}
