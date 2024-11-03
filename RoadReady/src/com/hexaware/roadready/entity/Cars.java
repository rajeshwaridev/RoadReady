package com.hexaware.roadready.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Cars {

    private int id;
    private String make;
    private String model;
    private int year;
    private BigDecimal pricePerDay;
    private boolean available;
    private LocalDateTime createdAt;
//    private List<Reservation> reservations;

    // Default constructor
    public Cars() {
    	super();
    }
    

    public Cars(int id, String make, String model, int year, BigDecimal pricePerDay, boolean available,
		LocalDateTime createdAt) {
	super();
	this.id = id;
	this.make = make;
	this.model = model;
	this.year = year;
	this.pricePerDay = pricePerDay;
	this.available = available;
	this.createdAt = createdAt;
}


	// Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public BigDecimal getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(BigDecimal pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }


	@Override
	public String toString() {
		return "Cars [id=" + id + ", make=" + make + ", model=" + model + ", year=" + year + ", pricePerDay="
				+ pricePerDay + ", available=" + available + ", createdAt=" + createdAt + "]";
	}

//    public List<Reservation> getReservations() {
//        return reservations;
//    }
//
//    public void setReservations(List<Reservation> reservations) {
//        this.reservations = reservations;
//    }
    
}

