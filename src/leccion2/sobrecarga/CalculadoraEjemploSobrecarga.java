package leccion2.sobrecarga;

public class CalculadoraEjemploSobrecarga {

    // Suma de dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }


    // Suma de tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // int[] params;
    public int sumar(int ...params) {
        int valorInicial = 0;
        for (int i = 0; i < params.length; i++) {
            valorInicial = valorInicial + params[i];
        }
        return valorInicial;
    }

    // Suma de dos números decimales (float)
    public float sumar(float a, float b) {
        return (int)(a + b);
    }

    // Suma de un entero y un número decimal
    public double sumar(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        CalculadoraEjemploSobrecarga calc = new CalculadoraEjemploSobrecarga();

        System.out.println(calc.sumar(2, 3)); // Llama al método sumar(int, int)
        System.out.println(calc.sumar(2, 3, 4)); // Llama al método sumar(int, int, int)
        System.out.println(calc.sumar(2.5f, 3.5f)); // Llama al método sumar(float, float)
        System.out.println(calc.sumar(2, 3.5)); // Llama al método sumar(int, double)
        System.out.println(calc.sumar(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println();
    }
}