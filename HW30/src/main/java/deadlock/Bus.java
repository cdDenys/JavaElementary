package deadlock;

public class Bus {
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    public synchronized String getCrashCar(){
        System.out.println("Ooops:(");
        return car.getCrashCar();
    }
}
