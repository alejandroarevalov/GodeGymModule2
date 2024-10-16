package leccion17;

import utilitarios.Automovil;
import utilitarios.UtilitariosGenerales;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class EjemplosReflexionMain<T> {

    public void obtenerClasePorReflexion() throws Exception {
        // Método 1
        Class<Futbolista> futbolistaClass = Futbolista.class;
        System.out.println(futbolistaClass);

        // Método 2
        Futbolista futbolista = new Futbolista("James Rodriguez", 10, "Mediapunta");
        Class<?> futbolistaClass2 = futbolista.getClass();
        System.out.println(futbolistaClass2);

        // Obtener el objeto Class usando Class.forName()
        Class<?> futbolistaClass3 = Class.forName("leccion17.Futbolista");
        System.out.println(futbolistaClass3);
    }

    public void crearObjetoDeClasePorReflexión() throws Exception {
        Futbolista unFutbolista = Futbolista.class.newInstance();
        Automovil automovil = Automovil.class.newInstance();
        unFutbolista.setNombre("Cristiano Ronaldo");
        unFutbolista.setDorsal(7);
        unFutbolista.setPosicion("Delantero");
        System.out.println(unFutbolista);

        Constructor<Futbolista> constructor = Futbolista.class.getConstructor(String.class, Integer.class, String.class);
        Futbolista otroFutbolista = constructor.newInstance("Lionel Messi", 10, "Delantero");
        System.out.println(otroFutbolista);

        Constructor<Futbolista> constructorQueNoDeberiaPoderLlamar = Futbolista.class.getDeclaredConstructor(Futbolista.class);
        constructorQueNoDeberiaPoderLlamar.setAccessible(true);
        Futbolista futbolistaClonado = constructorQueNoDeberiaPoderLlamar.newInstance(otroFutbolista);
        System.out.println("El futbolista clonado es: " + futbolistaClonado);
    }

    public void obtenerDatosDeClase() throws Exception {
        Class<Futbolista> clazz = Futbolista.class;
        Field[] atributos = clazz.getDeclaredFields();
        for (var atributo : atributos) {
            System.out.println(atributo);
        }
        Field unSoloAtributo = clazz.getDeclaredField("nombre");
        System.out.println(unSoloAtributo);
        UtilitariosGenerales.imprimirLineasSeparacion();
        Method[] metodos = clazz.getDeclaredMethods();
        for (var metodo : metodos) {
            System.out.println(metodo);
        }
        UtilitariosGenerales.imprimirLineasSeparacion();
        Constructor[] constructores = clazz.getDeclaredConstructors();
        Arrays.stream(constructores).forEach(System.out::println);
    }

    public void modificarEstadoDeUnObjetoPorReflexion() throws Exception {
        Constructor<Futbolista> constructor = Futbolista.class.getConstructor(String.class, Integer.class, String.class);
        Futbolista falcao = constructor.newInstance("Radamel Falcao Garcia", 9, "Delantero");
        System.out.println(falcao);
        Field dorsal = Futbolista.class.getDeclaredField("dorsal");
        dorsal.setAccessible(true);
        dorsal.set(falcao, 44); // falcao.setDorsal(44);
        System.out.println(falcao);
        System.out.println(dorsal.get(falcao));
        dorsal.setAccessible(false);
        UtilitariosGenerales.imprimirLineasSeparacion();
        // Campo estático
        Field seleccion = Futbolista.class.getDeclaredField("seleccion");
        System.out.println(seleccion.get(Futbolista.class));
    }

    public void invocarMetodosDeUnaClasePorReflexion() throws Exception {
        Constructor<Futbolista> constructor = (Constructor<Futbolista>) Class.forName("leccion17.Futbolista")
            .getDeclaredConstructor(String.class, Integer.class, String.class);
        Futbolista davinson = constructor.newInstance("Davinson Sanchez", 3, "Defensor Central");
        Method correr = Futbolista.class.getDeclaredMethod("correr");
        correr.invoke(davinson);

        Futbolista juanfer = constructor.newInstance("Juan Fernando Quintero", 20, "Volante de creación");
        Method realizarPase = Futbolista.class.getMethod("realizarPase", Futbolista.class);
        realizarPase.invoke(juanfer, davinson); // juanfer.realizarPase(davinson)
        realizarPase.invoke(davinson, juanfer);
        correr.invoke(juanfer);
    }

    public static void main(String[] args) throws Exception {
        EjemplosReflexionMain ejemplo = new EjemplosReflexionMain();
        ejemplo.obtenerClasePorReflexion();
        UtilitariosGenerales.imprimirLineasSeparacion();
        ejemplo.crearObjetoDeClasePorReflexión();
        UtilitariosGenerales.imprimirLineasSeparacion();
        ejemplo.obtenerDatosDeClase();
        UtilitariosGenerales.imprimirLineasSeparacion();
        ejemplo.modificarEstadoDeUnObjetoPorReflexion();
        UtilitariosGenerales.imprimirLineasSeparacion();
        ejemplo.invocarMetodosDeUnaClasePorReflexion();
    }
}
