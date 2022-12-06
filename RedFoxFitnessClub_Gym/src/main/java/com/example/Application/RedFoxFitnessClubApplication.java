package com.example.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.Model.GroupFitnessClass;
import com.example.Model.Guest;
import com.example.Model.PlanEnrolled;
import com.example.Model.Session;
import com.example.Model.User;
import com.example.Service.GroupFitnessClassService;
import com.example.Service.GuestService;
import com.example.Service.InventoryService;
import com.example.Service.PlanService;
import com.example.Service.SessionService;
import com.example.Service.TrainerService;
import com.example.Service.UserService;
import com.example.Util.ApplicationStop;
import com.example.Util.RedFoxFitnessClubUtil;

public class RedFoxFitnessClubApplication {

	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner(System.in);

			PlanService planService = new PlanService();
			UserService userService = new UserService();
			SessionService sessionService = new SessionService();
			InventoryService inventoryService = new InventoryService();
			GroupFitnessClassService groupFitnessClassService = new GroupFitnessClassService();
			GuestService guestService = new GuestService();
			TrainerService trainerService = new TrainerService();

			User user = new User();
			PlanEnrolled planEnrolled = new PlanEnrolled();
			List<Session> sessions = new ArrayList<>();
			List<Guest> guests = new ArrayList<>();

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
				case 7:
					System.out.println(user.getUsername()+" has purchased the plan on "+planEnrolled.getValidFrom());
					break;
				case 9:
					planEnrolled.setStatus("INACTIVE");
					break;
				case 10:
					Session s = sessionService.publishSession();
					sessions.add(s);
					System.out.println(s);
					break;

				case 11:
					guestService.addGuest(user.getUsername(), guests);
					guestService.displayGuests(user.getUsername(), guests);
					break;
					
				case 12:
					trainerService.display();
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

				System.out.println("\n");
			}
		} catch (ApplicationStop applicationStop) {
			System.out.println("Application Stopped Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
