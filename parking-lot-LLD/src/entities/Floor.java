package entities;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    List<ParkingSlot> parkingSlots;
    public Floor(int numOfSlots) {
        // we have assumed that the num of slots per floor would be greater than 2
        assert numOfSlots>=2;
        parkingSlots = new ArrayList<>();
        ParkingSlot parkingSlotForTruck = new ParkingSlot(VehicleType.TRUCK);
        parkingSlots.add(parkingSlotForTruck);

        ParkingSlot parkingSlotForBike = new ParkingSlot(VehicleType.BIKE);
        parkingSlots.add(parkingSlotForBike);
        parkingSlots.add(parkingSlotForBike);

        for(int i = 3; i<numOfSlots; i++){
            parkingSlots.add(new ParkingSlot(VehicleType.CAR));
        }
    }

}
