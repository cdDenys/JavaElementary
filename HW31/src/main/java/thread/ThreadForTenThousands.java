package thread;

import lombok.SneakyThrows;
import printer.Printer;

public class ThreadForTenThousands extends Thread {
    @Override
    @SneakyThrows
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Thread thread = new Thread(
                    () -> {
                        Thread.currentThread().setName("ThreadForTenThousands");
                        Printer.print(Thread.currentThread());
                    }
            );
            thread.start();
            thread.join();
        }
    }
}
