import model.Plain;
import thread.*;

public class Main {
    private static Plain plain = new Plain();

    public static void main(String[] args) {
        var threadForTenThousands = new ThreadForTenThousands();
        var anotherThreadForTenThousands = new AnotherThreadForTenThousands();

        threadForTenThousands.start();
        anotherThreadForTenThousands.start();

        Thread thread1 = new Thread(new Runnable() {
            private Plain plain = Main.plain;

            @Override
            public void run() {
                plain.countBeforeFly();
                plain.fly();
                plain.landingTime();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            private Plain plain = Main.plain;

            @Override
            public void run() {
                plain.countBeforeFly();
                plain.fly();
                plain.landingTime();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            private Plain plain = Main.plain;

            @Override
            public void run() {
                plain.countBeforeFly();
                plain.fly();
                plain.landingTime();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
