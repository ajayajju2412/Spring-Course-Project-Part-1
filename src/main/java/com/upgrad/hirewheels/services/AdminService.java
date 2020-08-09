package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Vehicle;
import com.upgrad.hirewheels.exceptions.VehicleAlreadyRegisteredException;

public interface AdminService {
    Vehicle registerVehicle(Vehicle vehicle) throws VehicleAlreadyRegisteredException;
    Vehicle changeAvailability(Vehicle vehicle);
}
