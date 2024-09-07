package leccion6;

import utilitarios.Persona;
import utilitarios.UtilitariosGenerales;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsEjemplo {

    private List<Persona> personas;

    public StreamsEjemplo() {
        Random random = new Random();
        personas = new ArrayList<>(
            List.of(
                new Persona("Juan", random.nextInt(0, 100), random.nextBoolean()),
                new Persona("Daniel", random.nextInt(0, 100), random.nextBoolean()),
                new Persona("Ana", random.nextInt(0, 100), random.nextBoolean()),
                new Persona("Juliana", 35, true),
                new Persona("Juliana", 35, true)
            )
        );
    }

    public void crearStreamDeColeccion() {
        System.out.println(personas);
        Stream<Persona> streamPersonas = personas.stream()
            .distinct()
            .sorted(Comparator.comparing(Persona::getEdad))
            .filter(p -> p.isCasado())
            .map(p -> new Persona(p.getNombre(), p.getEdad(), new Random().nextBoolean()));
        streamPersonas.forEach(System.out::println);
    }

    public void ordenarListaUsandoStreams() {
        System.out.println(personas);
        List<Persona> listaOrdenada = personas.stream()
            .sorted((p1, p2) -> p1.getNombre().compareTo(p2.getNombre())) // Comparator.comparing(Persona::getNombre);
            .collect(Collectors.toList());
        System.out.println(listaOrdenada);
    }

    public void ejemploStreamsAnyMatchConOperacionesCombinadas() {
        List<Integer> listaEdades = personas.stream()
            .distinct()
            .map(persona -> persona.getEdad())
            .collect(Collectors.toList());
        System.out.println(listaEdades);
    }

    public static void main(String[] args) {
        StreamsEjemplo ejemplo = new StreamsEjemplo();
        ejemplo.crearStreamDeColeccion();
        UtilitariosGenerales.imprimirLineasSeparacion();
        ejemplo.ordenarListaUsandoStreams();
        UtilitariosGenerales.imprimirLineasSeparacion();
        ejemplo.ejemploStreamsAnyMatchConOperacionesCombinadas();
    }

}
