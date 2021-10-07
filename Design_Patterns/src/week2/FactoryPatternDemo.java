package week2;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        VehicleFactory obj = new VehicleFactory();

        Vehicle obj1 = obj.getVehicle("Bike");

        obj1.startEngine();

        Vehicle obj2 = obj.getVehicle("Aeroplane");

        obj2.stopEngine();

    }

}
