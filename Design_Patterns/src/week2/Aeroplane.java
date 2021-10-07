package week2;

public class Aeroplane implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Engine started in Aeroplane Class");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped in Aeroplane Class");
    }
}
