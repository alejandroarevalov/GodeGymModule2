package leccion4;

public class Tesla implements Automovil {

    @Override
    public boolean cargarCombustible(int litros) {
        System.out.println("Los vehiculos electricos no " +
                "cargamos combustible");
        return false;
    }
}
