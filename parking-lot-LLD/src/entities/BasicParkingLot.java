package entities;

import AssignSlotStrategy.AssignSlotStrategy;

import java.util.ArrayList;
import java.util.List;

public class BasicParkingLot extends  ParkingLot{

    AssignSlotStrategy assignSlotStrategy;
    List<Floor> floors;
    String parkingId;

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public String getParkingId() {
        return parkingId;
    }

    public void setParkingId(String parkingId) {
        this.parkingId = parkingId;
    }

    public BasicParkingLot(String parkingId, int numOfFloors, int numOfSlotsPerFloor, AssignSlotStrategy assignSlotStrategy){
        this.assignSlotStrategy = assignSlotStrategy;
        this.parkingId = parkingId;
        floors = new ArrayList<>();
        for(int i = 0; i< numOfFloors; i++){
            Floor floor = new Floor(numOfSlotsPerFloor);
            floors.add(floor);
        }
    }

    public String assignSlot(String type, String regNo, String color) {
        return assignSlotStrategy.assignSlot(type,  regNo,  color, this.getFloors());
    }


    @Override
    public void unassignSlot(String ticNum) {
        for(int i = 0; i<floors.size(); i++ ) {
            // first empty strategy
            for (int j = 0; j < floors.get(i).parkingSlots.size(); j++) {
                ParkingSlot parkingSlot = floors.get(i).parkingSlots.get(j);
                if (parkingSlot.vehicleParked != null && parkingSlot.vehicleParked.ticket.ticketNum.compareToIgnoreCase(ticNum) == 0) {
                    System.out.println("Unparked vehicle with Registration Number: " +  parkingSlot.vehicleParked.regNo + " and Color: " +  parkingSlot.vehicleParked.colour);
                    parkingSlot.vehicleParked = null;
                    System.gc();
                    return;
                }
            }
        }
        System.out.println("Invalid ticket number");
    }

    @Override
    public void displayFreeCount(String vehicleType) {
        for(int i = 0; i<floors.size(); i++ ) {
            // first empty strategy
            int freeCount = 0;
            for (int j = 0; j < floors.get(i).parkingSlots.size(); j++) {
                ParkingSlot parkingSlot = floors.get(i).parkingSlots.get(j);
                if (parkingSlot.vehicleParked == null && parkingSlot.allowedVechileType == VehicleType.valueOf(vehicleType)) {
                    freeCount++;
                }
            }
            System.out.println("No. of free slots for " + vehicleType + " on Floor " +  (i + 1) + " : " + freeCount);
        }
    }

    @Override
    public void displayOccupiedSlots(String vehicleType) {
        int occupiedCounts = 0;
        for(int i = 0; i<floors.size(); i++ ) {
            // first empty strategy
                List<Integer> occupiedSlots = new ArrayList<Integer>();
                for (int j = 0; j < floors.get(i).parkingSlots.size(); j++) {
                    ParkingSlot parkingSlot = floors.get(i).parkingSlots.get(j);
                    if (parkingSlot.vehicleParked != null &&    parkingSlot.vehicleParked.vehicleType == VehicleType.valueOf(vehicleType) ) {
                        occupiedSlots.add(j+1);
                    }
                }
            System.out.println("Occupied slots for " + vehicleType + " on Floor" + (i + 1) + " : " + occupiedSlots);
        }
    }

    @Override
    public void displayFreeSlots(String vehicleType) {
        for(int i = 0; i<floors.size(); i++ ) {
            List<Integer> freeSlots = new ArrayList<Integer>();
            for (int j = 0; j < floors.get(i).parkingSlots.size(); j++) {
                ParkingSlot parkingSlot = floors.get(i).parkingSlots.get(j);
                if (parkingSlot.vehicleParked == null &&    parkingSlot.allowedVechileType == VehicleType.valueOf(vehicleType) ) {
                    freeSlots.add(j+1);
                }
            }
            System.out.println("Free slots for " + vehicleType + " on Floor" + (i + 1) + ":" + freeSlots);
        }
    }
}
