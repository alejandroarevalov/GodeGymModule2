package leccion4;

public interface Automovil {

    String CREADOR = "Carl Benz";
    default boolean cargarCombustible(int litros) {
        System.out.println("Combustible cargado: " + litros + " litros");
        metodoPrivado();
        return true;
    }

    private void metodoPrivado() {
        System.out.println("Se pueden implementar metodos privados");
    }
}
