package com.hexaware.roadready.entity;
import java.time.LocalDateTime;
//import java.util.List;
public class Users {




	    private int id;
	    private String firstName;
	    private String lastName;
	    private String email;
	    private String password;
	    private String phoneNumber;
	    private Role role;
	    private LocalDateTime createdAt;
//	    private List<Reservation> reservations;

	    // Default constructor
	    public Users() {
	    	super();
	    }
	    

	    public Users(int id, String firstName, String lastName, String email, String password, String phoneNumber, Role role,
		LocalDateTime createdAt) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.password = password;
	this.phoneNumber = phoneNumber;
	this.role = role;
	this.createdAt = createdAt;
}


		// Getters and Setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }

	    public Role getRole() {
	        return role;
	    }

	    public void setRole(Role role) {
	        this.role = role;
	    }

	    public LocalDateTime getCreatedAt() {
	        return createdAt;
	    }

	    public void setCreatedAt(LocalDateTime createdAt) {
	        this.createdAt = createdAt;
	    }

//	    public List<Reservation> getReservations() {
//	        return reservations;
//	    }
//
//	    public void setReservations(List<Reservation> reservations) {
//	        this.reservations = reservations;
//	    }

	    // Enum for Role
	    public enum Role {
	        CUSTOMER, ADMIN
	    }

		@Override
		public String toString() {
			return "Users [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
					+ ", password=" + password + ", phoneNumber=" + phoneNumber + ", role=" + role + ", createdAt="
					+ createdAt + "]";
		}
	    
	}

  
 
