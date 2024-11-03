package com.hexaware.roadready.entity;

import java.time.LocalDateTime;

public class AdminActions {

    private int adminId;
    private String action;
    private LocalDateTime actionDate;

    // Default constructor
    public AdminActions() {
    	super();
    	
    }
    

    public AdminActions(int adminId, String action, LocalDateTime actionDate) {
		super();
		this.adminId = adminId;
		this.action = action;
		this.actionDate = actionDate;
	}


	// Getters and Setters
    public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public LocalDateTime getActionDate() {
		return actionDate;
	}

	public void setActionDate(LocalDateTime actionDate) {
		this.actionDate = actionDate;
	}


	@Override
	public String toString() {
		return "AdminActions [adminId=" + adminId + ", action=" + action + ", actionDate=" + actionDate + "]";
	}


    
}

