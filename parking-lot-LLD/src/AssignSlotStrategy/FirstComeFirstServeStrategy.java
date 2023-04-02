package AssignSlotStrategy;

import entities.*;

import java.util.List;

public class FirstComeFirstServeStrategy implements  AssignSlotStrategy{

    // find-first
    @Override
    public String assignSlot(String type, String regNo, String color, List<Floor> floors) {
        Vehicle newVechile = new Vehicle(VehicleType.valueOf(type), regNo, color);
        for(int i = 0; i<floors.size(); i++ ){
            // first empty strategy
            for( int j=0 ; j<floors.get(i).getParkingSlots().size(); j++){
                ParkingSlot parkingSlot = floors.get(i).getParkingSlots().get(j);
                // no vehicles parked in that empty slot
                if( parkingSlot.getAllowedVechileType() == newVechile.getVehicleType() &&
                        parkingSlot.getVehicleParked() == null){
                    Ticket ticketAlloted = new Ticket( floors.get(i), parkingSlot, "PR1234", i+1, j+1);
                    newVechile.setTicket(ticketAlloted);
                    parkingSlot.setVehicleParked(newVechile);
                    System.out.println("Parked vehicle.Ticket id " +  ticketAlloted.getTicketNum());
                    return ticketAlloted.getTicketNum();

                }
            }
        }
        System.out.println("No free slots available");
        return null;
    }

}
