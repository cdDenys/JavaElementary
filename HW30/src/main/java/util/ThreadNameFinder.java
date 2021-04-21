package util;

public class ThreadNameFinder {
    public static int i = 1;
    public static void print(Thread thread){
        System.out.println(thread.getName() + " " + i++);
    }
}
