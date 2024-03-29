package com.etiya.rentacar.business.messages;

public class RentalMessages {
    public static final String rentalNotFound = "Rental not found";
    public static final String deletedRental = "This rental is deleted";
    public static final String checkCarState2 = "This vehicle has been rented before";
    public static final String checkCarState3 = "This vehicle is under maintenance";
    public static final String checkCustomerHasRented = "This customer has already rented a vehicle. Please return the vehicle.";
    public static final String checkDates = "Rental start date can not be after than end date";
    public static final String checkKilometers = "Car end kilometer can not be smaller than start kilometer after rental process";
}
