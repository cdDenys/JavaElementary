package thread;

import util.ThreadNameFinder;

public class ThirdThread extends Thread{
    @Override
    public void run() {
        Thread.currentThread().setName("ThirdThread response: ");
        for (int i = 0; i < 1000; i++) {
            ThreadNameFinder.print(Thread.currentThread());
        }
    }
}
