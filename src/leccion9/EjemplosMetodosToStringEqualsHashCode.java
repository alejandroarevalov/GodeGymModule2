package leccion9;

import utilitarios.Gato;
import utilitarios.UtilitariosGenerales;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EjemplosMetodosToStringEqualsHashCode {

    public void ejemploToString() {
        // Con toString sobrescrito
        Persona persona = new Persona("Alejandro", 39);
        System.out.println(persona);
        // Sin toString sobrescrito
        Gato gato = new Gato();
        System.out.println(gato);
    }

    public void ejemploEquals() {
        Persona persona1 = new Persona("Juan", 30);
        Persona persona2 = new Persona("Juan", 30);
        Persona persona3 = new Persona("Juan", 25);
        System.out.println("persona1.equals(persona2): " + persona1.equals(persona2)); // true
        System.out.println("persona1.equals(persona3): " + persona1.equals(persona3)); // false
    }

    public void ejemploHashCode() {
        Persona persona1 = new Persona("Daniela", 20);
        Persona persona2 = new Persona("Camila", 44);
        Persona persona3 = new Persona("Camila", 44);
        System.out.println(persona1.hashCode());
        System.out.println(persona2.hashCode());
        System.out.println(persona3.hashCode());
        Set<Persona> personas = new HashSet<>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3); // No se agregará porque persona2 y persona3 son iguales
        System.out.println(personas);

    }

    public static void main(String[] args) {
        EjemplosMetodosToStringEqualsHashCode ejemplos = new EjemplosMetodosToStringEqualsHashCode();
        ejemplos.ejemploToString();
        UtilitariosGenerales.imprimirLineasSeparacion();
        ejemplos.ejemploEquals();
        UtilitariosGenerales.imprimirLineasSeparacion();
        ejemplos.ejemploHashCode();
    }
}
