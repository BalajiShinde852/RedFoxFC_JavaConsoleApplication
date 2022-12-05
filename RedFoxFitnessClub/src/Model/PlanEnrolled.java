package Model;

import java.time.LocalDate;

public class PlanEnrolled {

	private int id;

	private String username;

	private int planId;

	private LocalDate validFrom;

	private LocalDate validTill;

	private String status;

	public PlanEnrolled() {

	}

	public PlanEnrolled(int id, String username, int planId, LocalDate validFrom, LocalDate validTill, String status) {
		super();
		this.id = id;
		this.username = username;
		this.planId = planId;
		this.validFrom = validFrom;
		this.validTill = validTill;
		this.status = status;
	}

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

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public LocalDate getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(LocalDate validFrom) {
		this.validFrom = validFrom;
	}

	public LocalDate getValidTill() {
		return validTill;
	}

	public void setValidTill(LocalDate validTill) {
		this.validTill = validTill;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "PlanEnrolled [id=" + id + ", username=" + username + ", planId=" + planId + ", validFrom=" + validFrom
				+ ", validTill=" + validTill + ", status=" + status + "]";
	}
	
	

}
