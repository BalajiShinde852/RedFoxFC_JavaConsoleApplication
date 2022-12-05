package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.GroupFitnessClass;
import Model.PlanEnrolled;
import Model.Session;
import Model.User;
import Service.GroupFitnessClassService;
import Service.InventoryService;
import Service.PlanService;
import Service.SessionService;
import Service.UserService;
import Util.ApplicationStop;
import Util.RedFoxFitnessClubUtil;

public class RedFoxFitnessClubApplication {

	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner(System.in);

			PlanService planService = new PlanService();
			UserService userService = new UserService();
			SessionService sessionService = new SessionService();
			InventoryService inventoryService = new InventoryService();
			GroupFitnessClassService groupFitnessClassService = new GroupFitnessClassService();

			User user = new User();
			PlanEnrolled planEnrolled = new PlanEnrolled();
			List<Session> sessions = new ArrayList<>();

			user = userService.createNewUser();

			while (true) {
				System.out.println(RedFoxFitnessClubUtil.options);
				System.out.print(RedFoxFitnessClubUtil.selectYourChoice);
				int option = scanner.nextInt();
				System.out.println(RedFoxFitnessClubUtil.selected + option);
				switch (option) {
				case 1:
				case 8:

					planService.displayPlans();
					System.out.print("Which Plan Do you prefer: ");
					int choice = scanner.nextInt();

					planEnrolled = planService.setPlanEnrolled(user.getUsername(), choice);
					String plan = choice == 1 ? "Basic Plan" : "Fox Plan";
					System.out.println(planEnrolled.getUsername() + " has been enrolled to the " + plan);

					break;

				case 2:
					inventoryService.displayShop();
					System.out.println("Please Purchase the Items at Store");
					break;
				case 3:
					Session ss = sessionService.publishOneonOne();
					sessions.add(ss);
					System.out.println(ss);
				case 4:
					sessions.forEach(sss -> {
						if (!sss.getSessionName().equalsIgnoreCase("one-on-one"))
							System.out.println(sss);
					});
					break;
				case 5:
					userService.displayAllUsers();
					break;
				case 6:
					System.out.print("Please Enter the username: ");
					String username = scanner.next();
					userService.displaySpecificUsers(username);
					break;
				case 9:
					planEnrolled.setStatus("INACTIVE");
					break;
				case 10:
					Session s = sessionService.publishSession();
					sessions.add(s);
					System.out.println(s);
					break;

				case 13:
					GroupFitnessClass groupFitnessClass = groupFitnessClassService.register(sessions,
							user.getUsername());
					System.out.println(groupFitnessClass);
					break;
				case 14:
					sessions.forEach(sss -> {
						if (sss.getSessionName().equalsIgnoreCase("one-on-one"))
							System.out.println(sss);
					});
					break;

				default:
					throw new ApplicationStop();
				}

				System.out.println("\n\n\n");
			}
		} catch (ApplicationStop applicationStop) {
			System.out.println("Application Stopped Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
