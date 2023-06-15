import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DiningPhilosophers {
    public static void main(String[] args) throws InterruptedException {
        int numberOfPhilosophers = 5;
        Philosopher[] philosophers = new Philosopher[numberOfPhilosophers];
        Object[] forks = new Object[numberOfPhilosophers];

        for (int i = 0; i < numberOfPhilosophers; i++) {
            forks[i] = new Object();
        }

        ExecutorService executorService = Executors.newFixedThreadPool(numberOfPhilosophers);

        for (int i = 0; i < numberOfPhilosophers; i++) {
            Object leftFork = forks[i];
            Object rightFork = forks[(i + 1) % numberOfPhilosophers];
            philosophers[i] = new Philosopher(leftFork, rightFork);
            executorService.execute(philosophers[i]);
        }

        // Запускаем потоки на 10 секунд
        executorService.awaitTermination(20, TimeUnit.SECONDS);

        // Останавливаем всех философов
        for (Philosopher philosopher : philosophers) {
            philosopher.stop();
        }

        executorService.shutdown();
    }
}

class Philosopher implements Runnable {
    private final Object leftFork;
    private final Object rightFork;
    private final Random random = new Random();
    private volatile boolean isRunning = true;
    public int i=0;
    public Philosopher(Object leftFork, Object rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    public void stop() {
        isRunning = false;
    }

    @Override
    public void run() {

        while (isRunning) {
            think();
            synchronized (leftFork) {
                synchronized (rightFork) {
                    eat();
                }
            }
        }
    }

    private void think() {
        try {
            System.out.println(Thread.currentThread().getName() + " размышляет");
            Thread.sleep(random.nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void eat() {

        try {
            System.out.println(Thread.currentThread().getName() + " ест"+ ++i);
            Thread.sleep(random.nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
