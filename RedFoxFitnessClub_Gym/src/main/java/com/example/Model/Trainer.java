package com.example.Model;

public class Trainer {
	
	public Trainer(String trainerName, String sessionType, int classesTaken) {
		super();
		this.trainerName = trainerName;
		this.sessionType = sessionType;
		this.classesTaken = classesTaken;
	}

	private String trainerName;
	
	private String sessionType;
	
	private int classesTaken;

	@Override
	public String toString() {
		return "Trainer [trainerName=" + trainerName + ", sessionType=" + sessionType + ", classesTaken=" + classesTaken
				+ "]";
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getSessionType() {
		return sessionType;
	}

	public void setSessionType(String sessionType) {
		this.sessionType = sessionType;
	}

	public int getClassesTaken() {
		return classesTaken;
	}

	public void setClassesTaken(int classesTaken) {
		this.classesTaken = classesTaken;
	}

}
