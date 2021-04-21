package deadlock;

public class Car {
    private Bus bus;

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public synchronized String getCrashCar(){
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ooops:(");
        return bus.getCrashCar();
    }

}
