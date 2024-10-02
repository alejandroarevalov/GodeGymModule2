package leccion13;

import leccion13.metodofabrica.TareaConString;

import java.util.concurrent.*;

public class EjemploExecutorService {

    public void usarExecutorServiceConThreadPoolFixed() {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            executorService.submit(new OtraTarea(i));
        }
        executorService.shutdown();
    }

    public void usarThreadPoolExecutor() {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
            3,
            5,
            5,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<Runnable>(5)
        );
        for (int i = 0; i < 4; i++) {
            executor.execute(new OtraTarea(i));
        }
        executor.shutdown();
    }

    public void usarScheduledThreadPoolExecutor() {
        ScheduledThreadPoolExecutor scheduler = new ScheduledThreadPoolExecutor(2);
        scheduler.schedule(new TareaConString("Tarea programada con retraso"), 10, TimeUnit.SECONDS);
        scheduler.scheduleAtFixedRate(new TareaConString("Tarea periódica"), 0, 2, TimeUnit.SECONDS);
        scheduler.schedule(() -> {
            System.out.println("Cerrando el scheduler...");
            scheduler.shutdown();
        }, 15, TimeUnit.SECONDS);
    }


    public static void main(String[] args) {
        EjemploExecutorService ejemplo = new EjemploExecutorService();
        ejemplo.usarExecutorServiceConThreadPoolFixed();
        ejemplo.usarThreadPoolExecutor();
        ejemplo.usarScheduledThreadPoolExecutor();


    }
}
