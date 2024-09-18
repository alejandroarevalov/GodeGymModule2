package leccion9;

import utilitarios.Gato;

public class EjemploCloneableYFinalize {

    private Persona otraPersona;

    public Persona ejemploClonarObjecto() throws Throwable {
        Persona persona = new Persona("Daniel", 57);
        persona.setMascota(new Gato());
        System.out.println(persona);
        Persona elClon = (Persona) persona.clone();
        System.out.println(elClon);
        System.out.println(persona.getMascota().equals(elClon.getMascota()));
        return elClon;
    }

    public void ejemploMetodoFinalize(Persona persona) throws Throwable {
        persona.finalizar();
        System.out.println();
    }

    public static void main(String[] args) throws Throwable {
        EjemploCloneableYFinalize ejemplo = new EjemploCloneableYFinalize();
        Persona clonada = ejemplo.ejemploClonarObjecto();
        ejemplo.ejemploMetodoFinalize(clonada);
    }
}
