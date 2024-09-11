package leccion7;

import utilitarios.*;

public class InstanceOfEjemplo {

    public void operarConInstanceOf() {
        Integer numero = 5464;
        String cadena = "Hola estudiantes";
        Object objeto = true;  // new Boolean(true)

        boolean esNumero = numero instanceof Integer;
        boolean esCadena = cadena instanceof String;
        boolean esUnDouble = objeto instanceof Double;

        // numero instanceof String -> Produce error de compilacion

        System.out.println("La variable 'numero' es un Integer?: " + esNumero);
        System.out.println("La variable 'cadena' es un String?: " + esCadena);
        System.out.println("La variable 'objeto es un Double'?: " + esUnDouble);


        System.out.println(numero.getClass().equals(Integer.class));
        System.out.println(numero.getClass().equals(String.class));
        System.out.println(numero.getClass().isAssignableFrom(String.class));
    }

    public void instanceOfConHerencia() {
        Ave gorrion = new Ave();
        if (gorrion instanceof Gorrion) {
            System.out.println("En Efecto... es un gorrion");
        }

        Animal otroGorrion = new Gorrion();
        Ave paloma = new Paloma();
        if (otroGorrion instanceof Gorrion) {
            System.out.println("otroGorrion es una instancia de gorrion");
        }

        if (paloma instanceof Animal) {
            System.out.println("La paloma es instancia de Animal");
        }

        if (otroGorrion instanceof Gato) {
            System.out.println("otroGorrion es instancia de ave");
        }

        Animal a = new Animal();
        System.out.println("animal es instancia de paloma:" + (a instanceof Paloma));
    }

    public void conversionDeTipos() {
        // Upcasting -> Ampliacion de tipo
        Gorrion unGorrionCualquiera = new Gorrion();
        Ave otraAve = unGorrionCualquiera; // Conversion o cast implito
        if (otraAve instanceof Gorrion) {
            System.out.println("En efecto... el gorrion es un ave");
            otraAve.hacerSonido();
            otraAve.volar();
            // Error de compilacion al no poder acceder desde la clase Ave al metodo cambiarPlumaje()
            // otraAve.cambiarPlumaje();
        }
        // Downcasting -> reduccion del tipo
        Object objecto = new Gorrion();
        if (objecto instanceof Gorrion) {
            System.out.println("En efecto... el gorrion es un objeto");
            // objecto.hacerSonido(); -> Operación no permitida, ya que la clase Object no contiene el metodo hacerSonido()
            // objecto.volar(); -> Operación no permitida, ya que la clase Object no contiene el metodo volar()
            Gorrion conversion = (Gorrion) objecto;
            Ave ave = (Ave) objecto;
            // Paloma paloma = (Paloma) objecto; -> Conversion explicita no realizable
            conversion.volar();
            conversion.hacerSonido();
        }
    }
    public void instanceOfJava14(Object objeto) {
        /* FORMA ANTIGUA
        if (objeto instanceof String) {
            String cadena = (String) objeto;
            System.out.println(cadena.toUpperCase());
        }
        */

        // FORMA DISPONIBLE DESDE JAVA 14
        if (objeto instanceof String variable) {
            System.out.println(variable.toUpperCase());
        } else if (objeto instanceof Integer numero) {
            System.out.println(numero * 10);
        }
    }

    public static void main(String[] args) {
        InstanceOfEjemplo ejemplo = new InstanceOfEjemplo();
        ejemplo.operarConInstanceOf();
        UtilitariosGenerales.imprimirLineasSeparacion();
        ejemplo.instanceOfConHerencia();
        UtilitariosGenerales.imprimirLineasSeparacion();
        ejemplo.conversionDeTipos();
        UtilitariosGenerales.imprimirLineasSeparacion();
        ejemplo.instanceOfJava14("Hola");
        ejemplo.instanceOfJava14(20);
        ejemplo.instanceOfJava14(true);
    }
}
