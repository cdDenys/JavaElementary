package thread;

import util.ThreadNameFinder;

import java.util.concurrent.Callable;

public class FirstCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        String callable = "FirstCallable.Class response: ";
        Thread.currentThread().setName("FirstCallable");
        for (int i = 0; i < 1000; i++) {
            ThreadNameFinder.print(Thread.currentThread());
        }
        return callable;
    }
}
