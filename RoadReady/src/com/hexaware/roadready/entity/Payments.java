package com.hexaware.roadready.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Payments {

    private int id;
    private int reservationId;
    private LocalDateTime paymentDate;
    private BigDecimal amount;
    private PaymentMethod paymentMethod;
    private PaymentStatus paymentStatus;

    // Default constructor
    public Payments() {
    	super();
    }
    

    public Payments(int id, int reservationId, LocalDateTime paymentDate, BigDecimal amount,
			PaymentMethod paymentMethod, PaymentStatus paymentStatus) {
		super();
		this.id = id;
		this.reservationId = reservationId;
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.paymentStatus = paymentStatus;
	}


	// Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservation(int reservationId) {
        this.reservationId = reservationId;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    // Enum for PaymentMethod
    public enum PaymentMethod {
        CREDIT_CARD, PAYPAL, CASH
    }

    // Enum for PaymentStatus
    public enum PaymentStatus {
        PENDING, COMPLETED, FAILED
    }

	@Override
	public String toString() {
		return "Payments [id=" + id + ", reservationId=" + reservationId + ", paymentDate=" + paymentDate + ", amount="
				+ amount + ", paymentMethod=" + paymentMethod + ", paymentStatus=" + paymentStatus + "]";
	}
    
}

