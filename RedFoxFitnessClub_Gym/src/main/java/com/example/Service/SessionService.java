package com.example.Service;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

import com.example.Model.Session;

public class SessionService {

	Scanner sc = new Scanner(System.in);

	public Session publishSession() {
		Random rand = new Random();
		Session s = new Session();
		System.out.println("Please Enter Session Name: ");
		s.setSessionName(sc.next().toLowerCase());
		System.out.println("Please Enter Trainer Name: ");
		s.setTrainerName(sc.next().toLowerCase());
		try {
			System.out.println("Please Enter Schedule Date Time in yyyy-mm-dd-hh-mm format: ");
			String date = sc.next();
			s.setScheduledDateTime(LocalDateTime.of(Integer.parseInt(date.split("-")[0]),
					Integer.parseInt(date.split("-")[1]), Integer.parseInt(date.split("-")[2]),
					Integer.parseInt(date.split("-")[3]), 0));
			} catch (Exception e) {
				System.out.println("Please Enter Schedule Date Time in yyyy-mm-dd-hh-mm format ONLY");
				this.publishSession();
			}
		s.setId(rand.nextInt(1000));
		s.setMaxMembers(25);
		s.setRemainingMembers(25);
		s.setStatus("scheduled");

		return s;

	}
	
	public Session publishOneonOne() {
		
		Random rand = new Random();
		Session s = new Session();
		s.setSessionName("one-on-one");
		System.out.println("Please Enter Trainer Name: ");
		s.setTrainerName(sc.next().toLowerCase());
		try {
		System.out.println("Please Enter Schedule Date Time in yyyy-mm-dd-hh-mm format: ");
		String date = sc.next();
		s.setScheduledDateTime(LocalDateTime.of(Integer.parseInt(date.split("-")[0]),
				Integer.parseInt(date.split("-")[1]), Integer.parseInt(date.split("-")[2]),
				Integer.parseInt(date.split("-")[3]), 0));
		} catch (Exception e) {
			System.out.println("Please Enter Schedule Date Time in yyyy-mm-dd-hh-mm format ONLY");
			this.publishOneonOne();
		}
		s.setId(rand.nextInt(1000));
		s.setMaxMembers(25);
		s.setRemainingMembers(25);
		s.setStatus("scheduled");

		return s;
		

	}

}
