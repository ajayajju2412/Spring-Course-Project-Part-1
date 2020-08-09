package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.daos.VehicleDAO;
import com.upgrad.hirewheels.entities.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("adminService")
public class AdminServiceImpl implements AdminService{

    @Autowired @Qualifier("vehicleDAO")
    VehicleDAO vehicleDAO;

    /*============================TODO 5.2==================================*/

    @Override
    public Vehicle registerVehicle(Vehicle vehicle) {
         Vehicle savedVehicle = vehicleDAO.save(vehicle);
         Vehicle savedVehicleNumber = vehicleDAO.findVehicleByVehicleNumber(savedVehicle.getVehicleNumber());
         savedVehicleNumber.setAvailabilityStatus(1);
         Vehicle registeredVehicle = vehicleDAO.save(savedVehicleNumber);
        return registeredVehicle;
    }
}
