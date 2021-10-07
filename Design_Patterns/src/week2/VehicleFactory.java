package week2;

public class VehicleFactory {

    public Vehicle getVehicle(String vehType) {
        if(vehType == null) {
            return null;
        } else if(vehType.equalsIgnoreCase("Bike")) {
            return new Bike();
        } else if (vehType.equalsIgnoreCase("Car")) {
            return new Car();
        } else if(vehType.equalsIgnoreCase("Aeroplane")) {
            return new Aeroplane();
        }
        return null;
    }

}
