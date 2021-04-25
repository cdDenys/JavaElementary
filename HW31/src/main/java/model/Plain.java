package model;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Plain {
    Lock lock = new ReentrantLock();

    public void countBeforeFly(){
        lock.lock();
        for (int i = 0; i < 10; i++) {
            System.out.println("countBeforeFly: " + i + " " + Thread.currentThread().getName());
        }
    }

    public void fly(){
        System.out.println("FLY " + Thread.currentThread().getName());
    }

    public void landingTime(){
        for (int i = 10; i >= 0; i--) {
            System.out.println("landingTime: " + i + " " + Thread.currentThread().getName());
        }
        lock.unlock();
    }

}
