package Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import Model.Plan;
import Model.PlanEnrolled;

public class PlanService {

	static Plan basicPlan = new Plan(1, "Basic Plan", 9.99);
	static Plan foxPlan = new Plan(2, "Fox Plan", 19.99);
	static List<Plan> plans = Arrays.asList(basicPlan, foxPlan);

	public void displayPlans() {
		System.out.println("The following are the plans offered by RFFC");
		plans.forEach(p -> System.out.println(p));
	}

	public PlanEnrolled setPlanEnrolled(String username, int choice) {
		Random rand = new Random();
		PlanEnrolled planEnrolled = new PlanEnrolled();
		planEnrolled.setId(rand.nextInt(10000));
		planEnrolled.setPlanId(choice);
		planEnrolled.setStatus("ACTIVE");
		planEnrolled.setUsername(username);
		planEnrolled.setValidFrom(LocalDate.now());
		planEnrolled.setValidTill(LocalDate.now().plusMonths(1));

		return planEnrolled;
	}
}
