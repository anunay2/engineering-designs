import java.util.List;

public class Building {

    List<Floor> floors;

    public Building(List<Floor> floorList) {
        this.floors = floorList;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public void addFloor(Floor floor){
        floors.add(floor);
    }


}
