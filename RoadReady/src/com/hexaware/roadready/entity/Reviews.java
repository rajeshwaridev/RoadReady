package com.hexaware.roadready.entity;

import java.time.LocalDateTime;

public class Reviews {

    private int id;
    private int userId;
    private int carId;
    private int rating;
    private String reviewText;
    private LocalDateTime createdAt;

    // Default constructor
    public Reviews() {
    	super();
    }
  
    public Reviews(int id, int userId, int carId, int rating, String reviewText, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.userId = userId;
		this.carId = carId;
		this.rating = rating;
		this.reviewText = reviewText;
		this.createdAt = createdAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Reviews [id=" + id + ", userId=" + userId + ", carId=" + carId + ", rating=" + rating + ", reviewText="
				+ reviewText + ", createdAt=" + createdAt + "]";
	}

  
   
}

