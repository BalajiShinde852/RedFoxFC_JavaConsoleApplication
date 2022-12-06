package com.example.Model;

import java.time.LocalDate;

public class GroupFitnessClass {

	public GroupFitnessClass(int id, String username, int eventId, String eventName, LocalDate enrolledOn,
			Boolean paidForEvent) {
		super();
		this.id = id;
		this.username = username;
		this.eventId = eventId;
		this.eventName = eventName;
		this.enrolledOn = enrolledOn;
		this.paidForEvent = paidForEvent;
	}

	public GroupFitnessClass() {
		// TODO Auto-generated constructor stub
	}

	private int id;

	private String username;

	private int eventId;

	private String eventName;

	private LocalDate enrolledOn;

	private Boolean paidForEvent = false;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public LocalDate getEnrolledOn() {
		return enrolledOn;
	}

	public void setEnrolledOn(LocalDate enrolledOn) {
		this.enrolledOn = enrolledOn;
	}

	public Boolean getPaidForEvent() {
		return paidForEvent;
	}

	public void setPaidForEvent(Boolean paidForEvent) {
		this.paidForEvent = paidForEvent;
	}

	@Override
	public String toString() {
		return "GroupFitnessClass [id=" + id + ", username=" + username + ", eventId=" + eventId + ", eventName="
				+ eventName + ", enrolledOn=" + enrolledOn + ", paidForEvent=" + paidForEvent + "]";
	}
}
