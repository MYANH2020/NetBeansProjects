/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinglot;

/**
 *
 * @author anhhuynh
 */
public class ParkingSpace implements Space {
    private VehicleSize vehicleSize;
    private VehicleType vehicleType;
    private boolean isTaken;
    public ParkingSpace( VehicleSize vehicleSize, VehicleType  vehicleType){
        this.vehicleSize = vehicleSize;
        this.vehicleType = vehicleType;
    }
    @Override
    public VehicleSize getSize(){
        return this.vehicleSize;
    }
    @Override
    public VehicleType getType(){
        return this.vehicleType;
    }
    @Override
    public boolean getIsTaken(){
        return this.isTaken;
    }
    @Override
    public void setIsTaken( boolean isTaken){
        this.isTaken = isTaken;
    }
    
}
