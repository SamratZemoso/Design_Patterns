package week2;

public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Engine started in Car Class");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped in Car Class");
    }
}
