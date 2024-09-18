package leccion9;

import utilitarios.UtilitariosGenerales;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class EjemploGetClass {

    public void ejemploGetClass() {
        Class<Persona> clazz = Persona.class;
        System.out.println("Metodos de la clase");
        Method[] metodosPersona = clazz.getMethods();
        Arrays.stream(metodosPersona).forEach(System.out::println);
        UtilitariosGenerales.imprimirLineasSeparacion();
        System.out.println("Atributos de la clase");
        Field[] campos = clazz.getDeclaredFields();
        Arrays.stream(campos).forEach(System.out::println);
        campos[0].setAccessible(true);

        // Crear una persona
        try {
            System.out.println("Creando una persona por reflexion");
            Persona personaPorReflexion = clazz.newInstance();
            Method metodoSetNombre = clazz.getMethod("setNombre", String.class);
            metodoSetNombre.invoke(personaPorReflexion, "Andres");
            Method metodoSetEdad = clazz.getMethod("setEdad", int.class);
            metodoSetEdad.invoke(personaPorReflexion, 50);
            Method elToStringDePersona = clazz.getMethod("toString", null);
            UtilitariosGenerales.imprimirLineasSeparacion();

            String personaToStringPorReflexion =
                (String) elToStringDePersona.invoke(personaPorReflexion, null);
            System.out.println(personaToStringPorReflexion);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        EjemploGetClass ejemplo = new EjemploGetClass();
        ejemplo.ejemploGetClass();
    }
}
