package week3;

public class Engineer {

    private HouseBuilder houseBuilder;

    public Engineer() {
        this.houseBuilder = new WoodHouseBuilder();
    }

    public void constructHouse() {
        houseBuilder.buildBasement();
        houseBuilder.buildFloor();
        houseBuilder.buildRoof();
        houseBuilder.buildWalls();
    }

    public House getHouse() {
        return houseBuilder.getHouse();
    }

}
