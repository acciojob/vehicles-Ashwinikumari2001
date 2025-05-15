package com.driver;

public class Boat implements WaterVehicle{
    String vehicleName;
    int vehicleCapacity;

    public Boat(String vehicleName, int vehicleCapacity){
        this.vehicleName=vehicleName;
        this.vehicleCapacity=vehicleCapacity;
    }
    public Boat(){}

    @Override
    public String getVehicleName() {
        return this.vehicleName;
    }

    @Override
    public int getVehicleCapacity() {
        return this.vehicleCapacity;
    }
}
