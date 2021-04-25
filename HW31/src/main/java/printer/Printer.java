package printer;

import java.util.concurrent.atomic.AtomicInteger;

public class Printer {
    public static AtomicInteger atomicInteger = new AtomicInteger(50000);
    public synchronized static void print(Thread thread) {
        System.out.println(thread.getName() + " : " + atomicInteger.decrementAndGet());
    }
}
