package com.upgrad.hirewheels.services;

import com.upgrad.hirewheels.entities.Booking;
import com.upgrad.hirewheels.exceptions.BookingFailedException;

public interface BookingService {
    Booking addBooking(Booking booking) throws BookingFailedException;
}
