package leccion5;

public class Caja<T> {

    private Class<T> claseDeObjeto;
    private T objeto;

    public Caja(Class<T> clazz) {
        this.claseDeObjeto = clazz;
    }

    public T crearObjeto() throws InstantiationException, IllegalAccessException {
        objeto = claseDeObjeto.newInstance();
        return objeto;
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Caja<String> caja = new Caja<>(String.class);
        Caja<Gato> caja2 = new Caja<>(Gato.class);
        String x = caja.crearObjeto();
        Gato unGato = caja2.crearObjeto();
        x.concat("Algo");
        System.out.println(x.concat("Algo"));
        unGato.emitirSonido();

    }
}
