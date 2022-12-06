package com.example.Model;

import java.time.LocalDate;

public class Guest {
	
	Guest(String guestName, String username, LocalDate visitedOn, int count) {
		super();
		this.guestName = guestName;
		this.username = username;
		this.visitedOn = visitedOn;
		this.count = count;
	}

	public Guest() {
		// TODO Auto-generated constructor stub
	}

	private String guestName;
	
	private String username;
	
	private LocalDate visitedOn;
	
	private int count;

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LocalDate getVisitedOn() {
		return visitedOn;
	}

	public void setVisitedOn(LocalDate visitedOn) {
		this.visitedOn = visitedOn;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Guest [guestName=" + guestName + ", username=" + username + ", visitedOn=" + visitedOn + ", count="
				+ count + "]";
	}

}
