package thread;

import util.ThreadNameFinder;

public class SecondRunnable implements Runnable{
    @Override
    public void run() {
        Thread.currentThread().setName("SecondRunnable response: ");
        for (int i = 0; i < 1000; i++) {
            ThreadNameFinder.print(Thread.currentThread());
        }
    }
}
