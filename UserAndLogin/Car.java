package UserAndLogin;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String carID;
    private String make;
    private String model;
    private int year;
    private int mileage;
    private String color;
    private String status;
    private double price;
    private String notes;
    private List<ServiceHistory2> histories2;

    public Car(String carID, String make, String model, int year, int mileage, String color, String status, double price, String notes, List<ServiceHistory2> histories2) {
        this.carID = carID;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.color = color;
        this.status = status;
        this.price = price;
        this.notes = notes;
        this.histories2 = histories2;
    }

    // Add a new car
    public Car addCar(String carID, String make, String model, int year, int mileage, String color, String status, double price, String notes, List<ServiceHistory2> histories) {
        return new Car(carID, make, model, year, mileage, color, status, price, notes, histories2);
    }

    // Update car details
    public void updateCar(String color, double price) {
        this.color = color;
        this.price = price;
        System.out.println("Car details updated.");
    }

    // Delete car
    public void deleteCar() {
        System.out.println("Car " + this.carID + " is deleted.");
        // Actual deletion logic goes here
    }

    // Car details
    public void getCarDetails() {
        System.out.println("Car ID: " + this.carID);
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Mileage: " + this.mileage);
        System.out.println("Color: " + this.color);
        System.out.println("Status: " + this.status);
        System.out.println("Price: $" + this.price);
        System.out.println("Notes: " + this.notes);
    }

    // Mark as sold
    public void markAsSold() {
        this.status = "Sold";
        System.out.println("Car " + this.carID + " has been marked as sold.");
    }

    public List<ServiceHistory2> getServiceHistory() {
        return this.histories2;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<ServiceHistory2> getHistories() {
        return histories2;
    }

    public void setHistories(List<ServiceHistory> histories) {
        this.histories2 = histories2;
    }

    public List<ServiceHistory2> getServiceHistory2() {
        return getServiceHistory2();
    }
}

class ServiceHistory2 {
    private String serviceDate;
    private String description;

    public ServiceHistory2(String serviceDate, String description) {
        this.serviceDate = serviceDate;
        this.description = description;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Service on: " + serviceDate + " - " + description;
    }

}
