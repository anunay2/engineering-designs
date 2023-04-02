package entities;

import java.util.Vector;

public class ParkingSlot {
    VehicleType allowedVechileType;
    Vehicle vehicleParked;

    public ParkingSlot(VehicleType allowedVechileType){
        this.allowedVechileType = allowedVechileType;
    }

    public VehicleType getAllowedVechileType() {
        return allowedVechileType;
    }

    public void setAllowedVechileType(VehicleType allowedVechileType) {
        this.allowedVechileType = allowedVechileType;
    }

    public Vehicle getVehicleParked() {
        return vehicleParked;
    }

    public void setVehicleParked(Vehicle vehicleParked) {
        this.vehicleParked = vehicleParked;
    }
}
