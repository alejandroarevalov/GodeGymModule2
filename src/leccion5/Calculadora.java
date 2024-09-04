package leccion5;

public class Calculadora {

    // Método genérico para sumar cualquier tipo de número
    public static <T extends Number> double sumar(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static void main(String[] args) {
        // Ejemplos de uso
        System.out.println("Suma de enteros: " + sumar(5, 10));  // 15.0
        System.out.println("Suma de dobles: " + sumar(5.5, 10.3));  // 15.8
        System.out.println("Suma de floats: " + sumar(3.2f, 2.8f));  // 6.0
        System.out.println("Suma de longs: " + sumar(100L, 200L));  // 300.0
    }
}