package leccion13;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

public class FibonacciCallable implements Callable<Integer> {

    private int numero;
    public FibonacciCallable(int numero) {
        this.numero = numero;
    }
    @Override
    public Integer call() {
        int primero = 0;
        int segundo = 1;
        dormirHilo();
        if (numero == 1) {
            return primero;
        } else if (numero == 2) {
            return segundo;
        } else {
            for (int i = 0; i < numero - 2; i++) {
                int temp = segundo;
                segundo += primero;
                primero = temp;
            }
            System.out.println("Callable terminado...");
            return segundo;
        }
    }

    private void dormirHilo() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        FibonacciCallable fibonacciCallable = new FibonacciCallable(3);
        // Ejemplo de crear un callable como una lambda.
        Callable<String> callable = () -> {
            Thread.sleep(5000);
            System.out.println("Ejecucion del callable terminada");
            return "Done";
        };

        RunnableFuture<Integer> futuro = new FutureTask<>(fibonacciCallable);

        Thread hilo = new Thread(futuro, "Hilo 1");
        System.out.println("Iniciando hilo 1...");
        hilo.start();

        try {
            System.out.println("Haciendo otras tareas mientras se ejecuta el cálculo...");
            Integer resultado = futuro.get();
            System.out.println("El fibonacci calculado es: " + resultado);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Terminando hilo principal...");
    }
}
