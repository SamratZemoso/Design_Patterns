package week2;

public class Bike implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Engine started in Bike Class");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped in Bike Class");
    }
}
