package Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Model.GroupFitnessClass;
import Model.Session;

public class GroupFitnessClassService {
	
	Scanner sc = new Scanner(System.in);
	
	public GroupFitnessClass register(List<Session> sessions,String username) throws Exception {
		GroupFitnessClass groupFitnessClass = new GroupFitnessClass();
		if(sessions.size()==0)
			throw new Exception("No Sessions Available");
		System.out.println("Sessions Available are:: ");
		sessions.forEach(sss -> {
			if (!sss.getSessionName().equalsIgnoreCase("one-on-one"))
				System.out.println(sss);
		});
		System.out.print("Please Enter the Session Id of which session you want to register: ");
		int id = sc.nextInt();
		Session newSession = new Session();
		for(Session sss:sessions) {
			if(sss.getId()==id) {
				newSession=sss;
				break;
			}
		}
		groupFitnessClass.setEnrolledOn(LocalDate.now());
		groupFitnessClass.setEventId(id);
		groupFitnessClass.setEventName(newSession.getSessionName());
		groupFitnessClass.setId(new Random().nextInt(10000));
		groupFitnessClass.setUsername(username);
		return groupFitnessClass;
		
	}

}
