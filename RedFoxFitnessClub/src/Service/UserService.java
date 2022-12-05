package Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import Model.User;

public class UserService {
	public UserService() {
		loadUsers();
	}

	Scanner sc = new Scanner(System.in);

	User user1 = new User("user1", "12345678", "First User", 22, 0, 0, false, LocalDate.now());
	User user2 = new User("user2", "12345678", "Second User", 22, 0, 0, false, LocalDate.now());
	User user3 = new User("user3", "12345678", "Third User", 22, 0, 0, false, LocalDate.now());
	User user4 = new User("user4", "12345678", "Forth User", 22, 0, 0, false, LocalDate.now());
	User user5 = new User("user5", "12345678", "Fifth User", 22, 0, 0, false, LocalDate.now());

	User user = new User();

	List<User> users = new ArrayList<>();

	public User createNewUser() {

		System.out.print("Enter UserName: ");
		String username = sc.next();
		System.out.print("Enter Password: ");
		String password = sc.next();
		sc.nextLine();
		System.out.print("Enter Fullname: ");

		String fullname = sc.nextLine();

		user.setUsername(username);
		user.setPassword(password);
		user.setFullname(fullname);
		user.setAge(22);
		user.setCreatedOn(LocalDate.now());
		user.setGuest(false);
		user.setPoints(0);
		user.setReferredBy(0);
		users.add(user);

		return user;

	}

	public void displayAllUsers() {
		users.forEach(u -> System.out.println(u));
	}

	public void displaySpecificUsers(String username) {
		users.forEach(u -> {
			if (u.getUsername().equalsIgnoreCase(username)) {
				System.out.println(u);
			}
		});
	}

	public void loadUsers() {
		users.addAll(Arrays.asList(user1, user2, user3, user4, user5));
	}

}
