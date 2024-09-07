package leccion6;

import utilitarios.UtilitariosGenerales;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EjemplosProgramacionFuncional {

    public void predicates() {
        Predicate<Integer> esPar = numero -> numero % 2 == 0;
        System.out.println(esPar.test(4)); // true
        System.out.println(esPar.test(7)); // false
    }

    public void supplier() {
        Supplier<String> saludo = () -> "Hola estudiantes de codeGym";
        System.out.println(saludo.get());
    }

    public void consumer() {
        Consumer<Integer> factorial = (number) -> {
            int result = 1;
            for (int i = 2; i <= number; i++) {
                result = result * i;
            }
            System.out.println(result);
        };
        factorial.accept(5);
    }

    public void functions() {
        Function<Integer, Integer> multiplicador = (num1) -> num1 * 2;
        System.out.println(multiplicador.apply(5));
    }
    public static void main(String[] args) {
        EjemplosProgramacionFuncional funcional = new EjemplosProgramacionFuncional();
        funcional.predicates();
        UtilitariosGenerales.imprimirLineasSeparacion();
        funcional.supplier();
        UtilitariosGenerales.imprimirLineasSeparacion();
        funcional.consumer();
        UtilitariosGenerales.imprimirLineasSeparacion();
        funcional.functions();
    }
}
