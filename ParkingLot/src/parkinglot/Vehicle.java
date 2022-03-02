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
public interface Vehicle {
    enum VehicleSize {
        SMALL,
        MEDUM,
        LARGE,
    }
    enum VehicleType {
        REGULAR,
        HANDICAPPED,
    }
    VehicleSize getSize();
    VehicleType getType();
    
}
