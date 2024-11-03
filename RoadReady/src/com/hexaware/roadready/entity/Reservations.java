package com.hexaware.roadready.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reservations {

    private int reservationId;
    private int userId;
    private int carId;
    private LocalDate startDate;
    private LocalDate endDate;
    private BigDecimal totalPrice;
    private Status status;
    private LocalDateTime createdAt;

    // Default constructor
    public Reservations() {
    	super();
    }
    

    public Reservations(int reservationId, int userId, int carId, LocalDate startDate, LocalDate endDate,
			BigDecimal totalPrice, Status status, LocalDateTime createdAt) {
		super();
		this.reservationId = reservationId;
		this.userId = userId;
		this.carId = carId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.totalPrice = totalPrice;
		this.status = status;
		this.createdAt = createdAt;
	}


	// Getters and Setters
  
    public int getReservationId() {
		return reservationId;
	}


	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public int getCarId() {
		return carId;
	}


	public void setCarId(int carId) {
		this.carId = carId;
	}


	public LocalDate getStartDate() {
		return startDate;
	}


	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}


	public LocalDate getEndDate() {
		return endDate;
	}


	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}


	public BigDecimal getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	// Enum for Status
    public enum Status {
        RESERVED, COMPLETED, CANCELLED
    }


	@Override
	public String toString() {
		return "Reservations [reservationId=" + reservationId + ", userId=" + userId + ", carId=" + carId
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", totalPrice=" + totalPrice + ", status="
				+ status + ", createdAt=" + createdAt + "]";
	}
    
}

