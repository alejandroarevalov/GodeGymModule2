package leccion6;

import utilitarios.Persona;
import utilitarios.PersonaNulaException;
import utilitarios.UtilitariosGenerales;

import java.util.Optional;
import java.util.Random;

public class OptionalsEjemplo {

    public Persona generarPersonaAleatoriamente() {
        Random random = new Random();
        if (random.nextBoolean()) {
            return new Persona("Oscar", 30, true);
        }
        return null;
    }

    public Optional<Persona> genenarPersonaAleatoriamenteConOptional() {
        Random random = new Random();
        if (random.nextBoolean()) {
            return Optional.of(new Persona("Oscar", 30, true));
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        OptionalsEjemplo ejemplo = new OptionalsEjemplo();
        Persona obtenida = ejemplo.generarPersonaAleatoriamente();
        if (obtenida != null) {
            System.out.println(obtenida.getEdad());
        } else {
            System.out.println("La persona es nula");
        }
        UtilitariosGenerales.imprimirLineasSeparacion();
        Optional<Persona> personaOptional = ejemplo.genenarPersonaAleatoriamenteConOptional();
        Persona persona = personaOptional.orElseGet(
            () -> new Persona("Desconocido", 0, false)
        );
        System.out.println(persona);

        try {
            Persona persona2 = personaOptional.orElseThrow(
                () -> new PersonaNulaException("El metodo ha devuelto una persona nula")
            );
        } catch (PersonaNulaException ex) {
            System.err.println(ex.getMessage());
        }
        System.out.println("El programa ha terminado satisfactoriamente");
    }

}
