public class ElevatorDisplay {

    int floor;
    Direction direction;


    public void display() {
        this.floor = floor;
        this.direction = direction;

    }

    public void setDisplay(int floorNum, Direction elevatorDirection) {
        System.out.println(floorNum);
        System.out.println(elevatorDirection);

    }


}
