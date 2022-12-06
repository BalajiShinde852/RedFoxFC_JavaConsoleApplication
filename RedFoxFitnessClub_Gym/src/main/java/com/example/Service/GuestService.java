package com.example.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.example.Model.Guest;

public class GuestService {

	Scanner sc = new Scanner(System.in);

	public List<Guest> addGuest(String username, List<Guest> guests) {
		Guest guest = new Guest();
		boolean flag = true;
		System.out.print("Enter Guest Name: ");
		String gname = sc.next();

		for (Guest g : guests) {
			if (g.getGuestName().equalsIgnoreCase(gname)) {
				g.setCount(g.getCount() + 1);
				g.setVisitedOn(LocalDate.now());
				flag = false;
			}
		}
		if (flag) {
			guest.setCount(1);
			guest.setGuestName(gname);
			guest.setUsername(username);
			guest.setVisitedOn(LocalDate.now());
			guests.add(guest);
		}
		
		return guests;
	}

	public void displayGuests(String username, List<Guest> guests) {
		if (guests.size() == 0) {
			System.out.println("No Guests for the user : " + username);
		} else {
			System.out.println("The Guests for the user : " + username + " are ");
			guests.forEach(g -> System.out.println(g));
		}
	}
}
