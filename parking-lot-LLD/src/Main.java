import AssignSlotStrategy.FirstComeFirstServeStrategy;
import AssignSlotStrategy.FirstComeLastServe;
import entities.BasicParkingLot;
import entities.ParkingLot;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    private final static Logger LOGGER =
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args) {

        BasicParkingLot parkingLot = null;
        while(true){
            Scanner sc = new Scanner(System.in);
            String[] input = sc.nextLine().split(" ");
            switch(input[0]){
                case "exit":
                    break;
                case "create_parking_lot":
                    LOGGER.info("creating parking lot : " + input[1] +  " with " + input[2] + " and " + input[3] +
                                    "slots per floor");
                    parkingLot = new BasicParkingLot(input[1],
                            Integer.parseInt(input[2]),
                            Integer.parseInt(input[3]), new FirstComeFirstServeStrategy());
                    continue;
                case "park_vehicle":
                    assert parkingLot != null;
                    String ticketNum = parkingLot.assignSlot(input[1], input[2], input[3]);
                    //LOGGER.info("Parked Vehicle.Ticket id : {}" + ticketNum);
                    continue;
                case "unpark_vehicle":
                    parkingLot.unassignSlot(input[1]);
                    continue;
                case "display_free_count":
                    assert parkingLot != null;
                    parkingLot.displayFreeCount(input[1]);
                    continue;
                case "display_free_slots" :
                    parkingLot.displayFreeSlots(input[1]);
                    continue;
                case "display_occupied_slots":
                    parkingLot.displayOccupiedSlots(input[1]);
                    continue;
                default:
                    System.out.println("Input not allowed.Please re-enter the input");
                    continue;
            }
        }


    }
}