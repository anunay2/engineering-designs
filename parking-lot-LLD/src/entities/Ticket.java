package entities;

public class Ticket {

    //String parkingLotId;
    Floor floor;
    ParkingSlot parkingSlot;

    String ticketNum;

    public Ticket( Floor floor, ParkingSlot parkingSlot, String parkingLotId, int floorId, int parkingSlotId){

          this.floor = floor;
          this.parkingSlot = parkingSlot;
          this.ticketNum = parkingLotId + "_" + floorId + "_" + parkingSlotId;

    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public String getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(String ticketNum) {
        this.ticketNum = ticketNum;
    }
}
