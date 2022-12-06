package com.example.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.example.Model.Trainer;

public class TrainerService {

	Trainer t1 = new Trainer("Trainer1", "zumba", 50);
	Trainer t2 = new Trainer("Trainer2", "cardio", 150);
	Trainer t3 = new Trainer("Trainer3", "yoga", 250);
	Trainer t4 = new Trainer("Trainer4", "zumba", 150);
	Trainer t5 = new Trainer("Trainer5", "cardio", 50);
	Trainer t6 = new Trainer("Trainer6", "yoga", 350);
	Trainer t7 = new Trainer("Trainer7", "zumba", 150);
	Trainer t8 = new Trainer("Trainer8", "cardio", 250);
	Trainer t9 = new Trainer("Trainer9", "yoga", 50);

	List<Trainer> trainers = Arrays.asList(t1, t2, t3, t4, t5, t6, t7, t8, t9);
	
	Scanner sc = new Scanner(System.in);
	public void display() {
		System.out.print("Please Select One Option: \n 1. To view All Trainers \n 2. To view Cardio Trainers \n"
				+ "3. To view Yoga Trainers \n 4. To view zumba trainers : ");
		int choice = sc.nextInt();
		sc.nextLine();
		switch(choice) {
		case 1:
			allTrainers();
			break;
		case 2:
			cardioTrainers();
			break;
		case 3:
			yogaTrainers();
			break;
		case 4:
			zumbaTrainers();
			break;
			
		}
	}
	
	public void allTrainers() {
		System.out.println("All trainers are: ");
		trainers.forEach(t -> System.out.println(t));
	}
	
	public void zumbaTrainers() {
		System.out.println("zumba trainers are: ");
		for(Trainer t: trainers) {
			if(t.getSessionType().equalsIgnoreCase("zumba"))
				System.out.println(t);
		}
	}
	
	public void cardioTrainers() {
		System.out.println("cardio trainers are: ");
		for(Trainer t: trainers) {
			if(t.getSessionType().equalsIgnoreCase("cardio"))
				System.out.println(t);
		}
	}
	
	public void yogaTrainers() {
		System.out.println("yoga trainers are: ");
		for(Trainer t: trainers) {
			if(t.getSessionType().equalsIgnoreCase("yoga"))
				System.out.println(t);
		}
	}
	

}
