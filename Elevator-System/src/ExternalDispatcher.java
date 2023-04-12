import java.util.List;

public class ExternalDispatcher {
    List<ElevatorController> elevatorControllerList = ElevatorCreator.elevatorControllerList;
    public void submitExternalRequest(int floorNum, Direction direction) {
        for(ElevatorController elevatorController : elevatorControllerList) {

            int elevatorID = elevatorController.elevatorCar.id;
            if (elevatorID%2==1 && floorNum%2==1){
                elevatorController.submitExternalRequest(floorNum,direction);
            } else if(elevatorID%2==0 && floorNum%2==0){
                elevatorController.submitExternalRequest(floorNum,direction);
            }
        }

    }
}
