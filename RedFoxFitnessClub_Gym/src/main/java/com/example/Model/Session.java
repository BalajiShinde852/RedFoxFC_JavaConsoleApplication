package com.example.Model;

import java.time.LocalDateTime;

public class Session {

	public Session() {
		
	}
	public Session(int id, String sessionName, String trainerName, int maxMembers, int remainingMembers, String status,
			LocalDateTime scheduledDateTime) {
		super();
		this.id = id;
		this.sessionName = sessionName;
		this.trainerName = trainerName;
		this.maxMembers = maxMembers;
		this.remainingMembers = remainingMembers;
		this.status = status;
		this.scheduledDateTime = scheduledDateTime;
	}

	private int id;

	private String sessionName;

	private String trainerName;

	private int maxMembers;

	private int remainingMembers;

	private String status;

	private LocalDateTime scheduledDateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSessionName() {
		return sessionName;
	}

	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public int getMaxMembers() {
		return maxMembers;
	}

	public void setMaxMembers(int maxMembers) {
		this.maxMembers = maxMembers;
	}

	public int getRemainingMembers() {
		return remainingMembers;
	}

	public void setRemainingMembers(int remainingMembers) {
		this.remainingMembers = remainingMembers;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getScheduledDateTime() {
		return scheduledDateTime;
	}

	public void setScheduledDateTime(LocalDateTime scheduledDateTime) {
		this.scheduledDateTime = scheduledDateTime;
	}

	@Override
	public String toString() {
		return "Session [id=" + id + ", sessionName=" + sessionName + ", trainerName=" + trainerName + ", maxMembers="
				+ maxMembers + ", remainingMembers=" + remainingMembers + ", status=" + status + ", scheduledDateTime="
				+ scheduledDateTime + "]";
	}
	
	

}
