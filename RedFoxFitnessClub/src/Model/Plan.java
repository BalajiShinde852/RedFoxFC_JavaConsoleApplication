package Model;

import java.io.Serializable;

public class Plan implements Serializable {
	
	public Plan() {
		
	}

	public Plan(int planId, String planName, double planAmount) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.planAmount = planAmount;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -1247175366776992483L;

	private int planId;

	private String planName;

	private double planAmount;

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public double getPlanAmount() {
		return planAmount;
	}

	public void setPlanAmount(double planAmount) {
		this.planAmount = planAmount;
	}

	@Override
	public String toString() {
		return "Plan [planId=" + planId + ", planName=" + planName + ", planAmount=" + planAmount + "]";
	}
	
	

}
