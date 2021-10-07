package week3;

public class WoodHouseBuilder implements HouseBuilder {

    private House house;

    public WoodHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("Wooden pillars");
    }

    @Override
    public void buildFloor() {
        house.setFloor("Wooden bars");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Wooden bars");
    }

    @Override
    public void buildWalls() {
        house.setWalls("Wooden blocks");
    }

    @Override
    public House getHouse() {
        System.out.println("Wooden House");
        return this.house;
    }
}
