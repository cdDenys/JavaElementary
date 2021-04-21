import deadlock.Bus;
import deadlock.Car;
import thread.FirstCallable;
import thread.SecondRunnable;
import thread.ThirdThread;

import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws Exception {

        FirstCallable firstCallable = new FirstCallable();
        SecondRunnable secondRunnable = new SecondRunnable();

        FutureTask<String> task = new FutureTask<>(firstCallable);
        Thread callable = new Thread(task);
        callable.start();
//        callable.join();

        Thread runnable = new Thread(secondRunnable);
        runnable.start();
//        runnable.join();

        ThirdThread thirdThread = new ThirdThread();

        thirdThread.start();
//        thirdThread.join();

        Car car = new Car();
        Bus bus = new Bus();

        car.setBus(bus);
        bus.setCar(car);

        Thread thread1 = new Thread(() -> System.out.println(car.getCrashCar()));
        Thread thread2 = new Thread(() -> System.out.println(bus.getCrashCar()));

        thread1.start();
        thread2.start();
    }
}
