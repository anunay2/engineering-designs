public class ElevatorCar {
    int id;
    ElevatorDisplay elevatorDisplay;
    InternalButtons internalButtons;
    ElevatorState elevatorState;
    Floor currentFloor;
    Direction elevatorDirection;
    ElevatorDoor elevatorDoor;

    public ElevatorCar(){
        elevatorDisplay = new ElevatorDisplay();
        internalButtons = new InternalButtons();
        elevatorState = ElevatorState.IDLE;
        currentFloor = new Floor(0);
        elevatorDirection = Direction.UP;
        elevatorDoor = new ElevatorDoor();
    }

    public void showDisplay(){
        elevatorDisplay.display();
    }

    public void pressButton(int destinationFloor){
        internalButtons.pressButton(destinationFloor, this);
    }

    public void setElevatorDisplay(){
        this.elevatorDisplay.setDisplay(currentFloor.getFloorNum(), elevatorDirection);
    }

    public boolean moveElevator(Direction dir, int destFloor){
        int startFloor = currentFloor.getFloorNum();
        if( dir == Direction.UP){
            for(int i = startFloor; i <= destFloor; i++){
                this.currentFloor = currentFloor;
                setElevatorDisplay();
                showDisplay();
                if ( i == destFloor){
                    return true;
                }
            }
        }
        else if ( dir == Direction.DOWN){
            for(int i = startFloor; i>=destFloor; i++){
                this.currentFloor = currentFloor;
                setElevatorDisplay();
                showDisplay();
                if( i == destFloor){
                    return true;
                }
            }
        }
        return false;
    }



}
