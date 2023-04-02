package entities;

public class Vehicle {
    VehicleType vehicleType;
    String colour;
    String regNo;

    Ticket ticket;

    public  Vehicle(VehicleType vehicleType, String regNo, String colour){
        this.vehicleType = vehicleType;
        this.colour = colour;
        this.regNo = regNo;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
