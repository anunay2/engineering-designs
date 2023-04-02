package entities;

public abstract class ParkingLot {
    public abstract void unassignSlot(String regid);

    public abstract void displayFreeCount(String vehicleType);

    public abstract void displayOccupiedSlots(String vehicleType);

    public abstract void displayFreeSlots(String s);

}
