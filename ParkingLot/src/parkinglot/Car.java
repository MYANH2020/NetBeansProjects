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
public class Car implements Vehicle {
    private VehicleType type;
    public Car( VehicleType type){
        this.type = type;
    }
    public VehicleSize getSize(){
        return VehicleSize.MEDUM;
    }
    public VehicleType getType(){
        return this.type;
    }
    
    
}
