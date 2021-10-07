package week3;

public class House implements HousePlan {

    private String basement;
    private String floor;
    private String roof;
    private String walls;

    @Override
    public void setBasement(String basement) {
        this.basement = basement;
    }

    @Override
    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public void setWalls(String walls) {
        this.walls = walls;
    }
}
