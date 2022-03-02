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
public class Truck implements Vehicle {
    private VehicleType type;
    public Truck( VehicleType type){
        this.type = type;
    }

    @Override
    public VehicleSize getSize() {
        return VehicleSize.LARGE;
    }

    @Override
    public VehicleType getType() {
        return this.type;
        
    }
    
}
