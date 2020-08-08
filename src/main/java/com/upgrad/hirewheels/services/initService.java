package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.*;

public interface initService {

    Users populateUserDetails(Users user);
    Role populateUserRoleDetails(Role role);
    VehicleCategory populateVehicleCategoryDetails(VehicleCategory vehicleCategory);
    VehicleSubCategory populateVehicleSubCategoryDetails(VehicleSubCategory vehicleSubCategory);
    FuelType populateFuelTypeDetails(FuelType fuelType);
    City populateCityDetails(City city);
    Location populateLocationDetails(Location location);
}
